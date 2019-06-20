/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.customerdao;
import elms.po.*;
import java.beans.PropertyVetoException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author YukiMuraRindon
 */
public class customerserviceimpl {
     customerdao p = new customerdao();
    public List<Customer> findAll(){
        String sql = "select * from t_customer where state = 1";
        Object[] parmas = {};
        return p.query(sql,Customer.class,parmas);
}
    public boolean update(Customer pp) {
       String sql = "update t_customer set cusname=?,taobaoid=?,cusphone=?,postcard=?,cusaddress=?,lastdeliverydate=? where cusid=?";
       Object[] params = {pp.getCusname(),pp.getTaobaoid(),pp.getCusphone(),pp.getPostcard(),pp.getCusaddress(),pp.getLastdeliverydate(),pp.getCusid()};
       return p.update(sql, params);
    }
    
    public boolean delete(int id){
        String sql = "update t_customer set state= -1  where cusid=?";
        Object[] parmas = {id};
        return p.update(sql,parmas);
    }
    public boolean insert(Customer pp) {
       String sql = "insert into t_customer (cusid,cusname,taobaoid,cusphone,postcard,cusaddress,lastdeliverydate) values(?,?,?,?,?,?,?)";
       Object[] params = {pp.getCusid(),pp.getCusname(),pp.getTaobaoid(),pp.getCusphone(),pp.getPostcard(),pp.getCusaddress(),pp.getLastdeliverydate()};
         //System.out.println(sql);
         return p.update(sql, params);
    }
    public List<Customer> select(String username){
        String sql = "select * from t_customer where cusname = ? and state = 1";
        Object[] parmas = {username};
        return p.query(sql,Customer.class,parmas);
}
}
