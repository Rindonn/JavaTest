/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.biz;

import java.math.BigDecimal;
import java.util.List;
import jdbc.basic.Product;
import jdbc.dao.ProductDao;

/**
 *
 * @author yhy
 */
public class ProductBizImpl implements ProductBiz{
   //引入DAO对象
    ProductDao pdao = new ProductDao();
    @Override
    public boolean addProduct(Product p) {
       String sql = "insert into product(pname,supplier,price) values(?,?,?)";
       Object[] params = {p.getPname(),p.getSupplier(),p.getPrice()};
       return pdao.update(sql, params);
    }

    @Override
    public boolean delProduct(int pid) {
        String sql = "update product set state=0 where pid=?";
        Object[] params={pid};
        return pdao.update(sql, params);
    }

    @Override
    public boolean updateProduct(Product p) {
       String sql = "update product set pname=?,supplier=?,price=? where pid=?";
       Object[] params = {p.getPname(),p.getSupplier(),p.getPrice(),p.getPid()};
       return pdao.update(sql, params);
    }  

    @Override
    public Product findByID(int pid) {
        String sql = "select * from product where state=1 and pid="+pid;
        return (Product) pdao.get(sql, Product.class);
    }

    @Override
    public Product findByName(String pname) {
        //字符串参数加 ''
        String sql ="select * from product where state=1 and pname='"+pname+"'";
        return (Product) pdao.get(sql, Product.class);
    }

    @Override
    public List<Product> findAll() {
        String sql = "select * from product where state=1";
        return pdao.query(sql, Product.class);
    }

    @Override
    public List<Product> findByCondition(String conditions) {
        String sql = "select * from product where concat(pname,supplier) like '%"+conditions+"%'";
        return pdao.query(sql, Product.class);
    }
    //测试业务
    public static void main(String[] args) {
        ProductBizImpl pbiz = new ProductBizImpl();
        //增加
        //pbiz.addProduct(new Product("OPPO5X","xxx手机生产商",new BigDecimal(1800)));
        //删除
        //pbiz.delProduct(2);
        //查询
        List<Product> list = pbiz.findByCondition("济");
        for(Product p:list){
            System.out.println(p);
        }
    }
}
