/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.po.Product;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author yhy
 */
public interface ProductBiz {
          //1增加
    public boolean addProduct(Product p);
    //2删除
    public boolean delProduct(int pid);
    //3修改
    public boolean updateProduct(Product p);
    //4根据编号查找
    public Product findByID(int pid);
    //5根据名称查找
    public Product findByName(String pname);
    //6查询所有
    public List<Product> findAll();
    //7模糊查询
    public List<Product> findByCondition(String conditions);
    //8 根据商品编号修改库存 //事务操作，传递连接对象
    public boolean updateStock(Connection conn,int upamount,int pid);
    
}
