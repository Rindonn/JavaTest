/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.BaseDao;
import elms.dao.productdao;
import elms.dao.selldao;
import elms.po.Customer;
import elms.po.Sell;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class sellserviceimpl {
     selldao s = new selldao();
     productdao p = new productdao();
    public List<Sell> findAll() {
        String sql = "select * from t_sell s left join t_product pro on pro.proid = s.proid left join t_customer c on s.cusid=c.cusid left join t_employee e on s.uid = e.uid;";
        Object[] params = {};
        return s.query(sql,Sell.class,params);
    }
    public List<Sell> getByEmp(String start,String end){
        String sql = "select emp.uid,truename,SUM(sellnum*sellprice) countmoney from t_employee emp left join t_sell se on emp.uid = se.uid where selldate between ? and ? group by emp.uid order by countmoney DESC limit 0,10";
        Object[] params = {start,end};
        return s.query(sql,Sell.class,params);
    }
    public List<Sell> getByEmp(String start, String end, String key) {
        String sql = "select * from t_sell s left join t_product pro on pro.proid = s.proid left join t_customer c on s.cusid=c.cusid left join t_employee e on s.uid = e.uid where selldate between ? and ? and concat(seid,proname) like ?";
        Object[] params = {start,end,"%"+key+"%"};
        return s.query(sql,Sell.class,params);
    }
    public List<Sell> getByCus(String start,String end){
        String sql = "select * from t_sell s left join t_customer c on c.cusid = s.cusid where s.selldate between ? and ? order by s.sellprice desc";
        Object[] params = {start,end};
        return s.query(sql,Sell.class,params);
    }
    public boolean sell(Object[][] purchases, Object[][] product) {
        boolean result = true;
        String sql1 = "insert into t_sell(seid,proid,cusid,uid,sellprice,sellnum,selldate,sellreturnamount) values(?,?,?,?,?,?,?,?)";
        String sql2 = "update t_product set quantity = quantity - ? where proid=?";
        Connection conn = new selldao().getConnection();   
        try {
            conn.setAutoCommit(false);
            s.batchUpdate(conn, sql1, purchases);
            p.batchUpdate(conn, sql2, product);
            conn.commit();
        } catch (Exception e) {
            try {
                result = false;
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }
        return result;
    }
}
