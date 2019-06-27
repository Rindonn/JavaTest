/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.dao.BaseDao;
import com.hpe.pps.dao.ProductDao;
import com.hpe.pps.dao.PurchaseDao;
import com.hpe.pps.vo.ViewPurchase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yhy
 */
public class PurchaseBizImpl implements PurchaseBiz{
    ProductDao prodao = new ProductDao();//商品dao
    PurchaseDao purdao = new PurchaseDao();//采购dao
    @Override
    public boolean purchasein(Object[][] purchases,Object[][]stocks) {
        boolean result = true;
        String sql1 = "insert into purchase(purno,pid,purchaseamount,purchaseprice,purtotals,supplierid,purchasedate) values(?,?,?,?,?,?,?)";
        String sql2 = "update product2 set currentamount=currentamount+?,lastpurchasetime=? where pid=?";//库存增加
        Connection conn = new BaseDao().getConnection();//获得连接
        
        try {
             conn.setAutoCommit(false);//设置不自动提交
             
             purdao.batchUpdate(conn, sql1, purchases);//批量添加采购表
             prodao.batchUpdate(conn, sql2, stocks);//更新商品库存
             conn.commit();     //手动提交事务
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }

    @Override
    public boolean purchasereturn(Object[][] purchasereturn,Object[][] stocks) {
       boolean result = true;
        String sql1 = "insert into purchase(purno,pid,purchaseamount,purchaseprice,purtotals,supplierid,purchasedate) values(?,?,?,?,?,?,?)";
        String sql2 = "update product2 set currentamount=currentamount-? where pid=?";//库存减少
        Connection conn = new BaseDao().getConnection();//获得连接
        
        try {
             conn.setAutoCommit(false);//设置不自动提交
             purdao.batchUpdate(conn, sql1, purchasereturn);//批量添加采购表
             prodao.batchUpdate(conn, sql2, stocks);//更新商品库存
             conn.commit();     //提交事务
        } catch (Exception e) {
           try {
               result = false;
               conn.rollback(); //回滚事务
           } catch (SQLException ex) {
              ex.printStackTrace();
           }
            e.printStackTrace();
        }
       return result;
    }

    @Override
    public List<ViewPurchase> findByCondition(String start, String end, String conditions) {
        String sql = "select * from view_purchase where purchasedate between '"+start+"' and '"+end+"'";
        if(conditions != null && conditions.length()>0){
            sql +=" and concat(purno,pname,supname) like '%"+conditions+"%'";
        }
        return purdao.query(sql, ViewPurchase.class);
    }

    @Override
    public boolean purchasereturn(int purid, int returnamount, Date returntime, int pid) {
      boolean result = true;
      //修改采购表的退货数量和退货时间
      String sql1 = "update purchase set returnamount=?,returntime=?,purchaseamount=purchaseamount-? where purid=?";
      Object[] params1 = {returnamount,returntime,returnamount,purid};
      String sql2 = "update product2 set currentamount= currentamount-? where pid=?";
      Object[] params2 = {returnamount,pid};
        Connection conn = new BaseDao().getConnection();
        try {
          
            conn.setAutoCommit(false);//启动事务
            purdao.update(conn, sql1, params1);
            prodao.update(conn, sql2, params2);
            conn.commit();           
        } catch (Exception e) {
            try {
                result = false;
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
       return result;
    }
    
}
