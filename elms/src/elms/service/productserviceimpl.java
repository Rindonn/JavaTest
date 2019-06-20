/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.productdao;
import elms.po.Product;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class productserviceimpl implements productservice{
    productdao p = new productdao();
    @Override
    public List<Product> findAll(){
        String sql = "select * from t_product where state = 1";
        Object[] parmas = {};
        return p.query(sql,Product.class,parmas);
}
    public boolean update(Product pp) {
       String sql = "update t_product set proname=?,protype=?,storecount=?,quantity=?,suggestbuyprice=?,suggestsaleprice=? where proid=?";
       Object[] params = {pp.getProname(),pp.getProtype(),pp.getStorecount(),pp.getQuantity(),pp.getSuggestbuyprice(),pp.getSuggestsaleprice(),pp.getProid()};
       return p.update(sql, params);
    }
    
    public boolean delete(int id){
        String sql = "update t_product set state= -1  where proid=?";
        Object[] parmas = {id};
        return p.update(sql,parmas);
    }
    public boolean insert(Product pp) {
       String sql = "insert into t_product (proid,proname,protype,storecount,quantity,suggestbuyprice,suggestsaleprice) values(?,?,?,?,?,?,?)";
       Object[] params = {pp.getProid(),pp.getProname(),pp.getProtype(),pp.getStorecount(),pp.getQuantity(),pp.getSuggestbuyprice(),pp.getSuggestsaleprice()};
       //System.out.println(sql);
       return p.update(sql, params);
    }
}
