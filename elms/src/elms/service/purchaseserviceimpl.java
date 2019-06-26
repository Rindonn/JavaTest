/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.BaseDao;
import elms.dao.purchasedao;
import elms.po.Purchase;
import elms.util.DateChooserJButton;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YukiMuraRindon
 */
public class purchaseserviceimpl implements purchaseservice {
purchasedao p = new purchasedao();
    @Override
    public boolean purchaseIn(Object[][] product, Object[][] purchase) {
        boolean result = true;
        purchasedao p = new purchasedao();
        String sql = "insert into t_purchase(purid,proid,supid,purprice,purnumber,unit,totalmoney,purdate) values(?,?,?,?,?,?,?,?)";
        String sql1 = "update t_product set quantity = quantity + ? where proid = ?";
        //获取连接对象
        Connection con = new BaseDao().getConnection();
        try {
            con.setAutoCommit(false);
            p.batchUpdate(con,sql,purchase);
            p.batchUpdate(con, sql1, product);
            con.commit();
        } catch (SQLException ex) {
            //设置事务回滚，报错
            result = false;
            try {
                con.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(purchaseserviceimpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return result;
        
    }

    public List<Purchase> findAll() {
        
        String sql = "select * from t_purchase pur left join t_product pro on pro.proid = pur.proid left join t_supplier sup on pur.supid=sup.supid";
        Object[] params = {};
        return p.query(sql,Purchase.class,params);
    }

    public List<Purchase> findAll(String a){
        String sql = "SELECT * from t_supplier t left join t_product p on t.supfullname = p.proname left join t_purchase u on t.supid = u.supid where u.purnumber != 0 order by t.supid asc;";
        Object[] parmas = {};
        return p.query(sql,Purchase.class,parmas);
}
    
    @Override
    public List<Purchase> getByPurchase(String start, String end, String key) {
        purchasedao p = new purchasedao();
        String sql = "select * from t_purchase pur left join t_product pro on pro.proid = pur.proid left join t_supplier sup on pur.supid=sup.supid where purdate between ? and ? and concat(supfullname,proname) like ?";
        Object[] params = {start,end,"%"+key+"%"};
        return p.query(sql,Purchase.class,params);
    }
    
    public List<Purchase> getBySup(String start,String end,String key,String str){
        purchasedao p = new purchasedao();
        String sql = "";
        if(str.equals("pur.supid")){
            sql = "select * from t_purchase pur left join t_product pro on pro.proid = pur.proid left join t_supplier sup on pur.supid=sup.supid where purdate between ? and ? and pur.supid like ?";// 
            Object[] params = {start,end,"%"+key+"%"};//,str      
            return p.query(sql,Purchase.class,params);
        }
        else{
            sql = "select * from t_purchase pur left join t_product pro on pro.proid = pur.proid left join t_supplier sup on pur.supid=sup.supid where purdate between ? and ? and sup.supfullname like ?";// 
            Object[] params = {start,end,"%"+key+"%"};//,str 
            return p.query(sql,Purchase.class,params);
        }
    }

    public List<Purchase> get(String start,String end,String key) {
        if(key.equals("pro")){
            String sql = "select pro.proid,proname,protype,protype,SUM(purnumber) countnum,SUM(totalmoney) countmoney from t_product pro LEFT JOIN t_purchase pur on pro.proid = pur.proid where purdate between ? and ? GROUP BY pro.proid ORDER BY countmoney DESC";
            Object[] params = {start,end};
            return p.query(sql, Purchase.class, params);
        }
        else{
            String sql = "SELECT pur.supid,supfullname,t_purchase.purnumber,sum(totalmoney) countmoney from t_supplier sup LEFT JOIN t_purchase pur on pur.supid = sup.supid where purdate between ? and ? GROUP BY pur.supid ORDER BY countmoney DESC";
            Object[] params = {start,end};
            return p.query(sql, Purchase.class, params);
        }
    }
    
    
}
