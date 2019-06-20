/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.biz;

import java.util.List;
import jdbc.basic.Product;

/**
 * 商品管理业务接口
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
    
    
}
