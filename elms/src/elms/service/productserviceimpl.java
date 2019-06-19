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
    public List<Product> findAll(int id){
        String sql = "select * from t_product where id=?";
        Object[] parmas = {};
        return productdao.query(sql,Product.class,parmas);
}

    @Override
    public List<Product> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
