/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.dao.ProductDao;
import com.hpe.pps.po.Product;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author yhy
 */
public class ProductBizImpl implements ProductBiz{
    //引入dao
    ProductDao pdao = new ProductDao();
    @Override
    public boolean addProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delProduct(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProduct(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findByID(int pid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product findByName(String pname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> findByCondition(String conditions) {
        String sql = "select * from product2 where state=1 ";
        if(conditions !=null && conditions.length()>0){
            sql +=" and concat(pname,ptype) like '%"+conditions+"%'";
        }
        return pdao.query(sql, Product.class);
    }

    @Override
    public boolean updateStock(Connection conn,int upamount,int pid) {
      return false;
    }
    
}
