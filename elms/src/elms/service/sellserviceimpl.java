/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.selldao;
import elms.po.Sell;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class sellserviceimpl {
     selldao s = new selldao();
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
}
