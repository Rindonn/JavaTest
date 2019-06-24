/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.BaseDao;
import elms.dao.purchasedao;
import elms.po.Purchase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YukiMuraRindon
 */
public class purchaseserviceimpl implements purchaseservice {

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
        purchasedao p = new purchasedao();
        String sql = "select * from t_purchase pur left join t_product pro on pro.proid = pur.proid left join t_supplier sup on pur.supid=sup.supid";
        Object[] params = {};
        return p.query(sql,Purchase.class,params);
    }
    
}
