/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.*;
import elms.po.Purchase;
import elms.po.Supplier;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class supplierserviceimpl implements supplierservice {

   supplierdao p = new supplierdao();
    public List<Supplier> findAll(){
        String sql = "select * from t_supplier where state = 1";
        Object[] parmas = {};
        return p.query(sql,Supplier.class,parmas);
}

    public boolean update(Supplier pp) {
       String sql = "update t_supplier set supaddreviation=?,supfullname=?,owner=?,job=?,mobile=?,supaddress=? where supid=?";
       Object[] params = {pp.getSupaddreviation(),pp.getSupfullname(),pp.getOwner(),pp.getJob(),pp.getMobile(),pp.getSupaddress(),pp.getSupid()};
       return p.update(sql, params);
    }
    
    public boolean delete(int id){
        String sql = "update t_supplier set state= -1  where supid=?";
        Object[] parmas = {id};
        return p.update(sql,parmas);
    }
    public boolean insert(Supplier pp) {
       String sql = "insert into t_supplier (supid,supaddreviation,supfullname,owner,job,mobile,supaddress) values(?,?,?,?,?,?,?)";
       Object[] params = {pp.getSupid(),pp.getSupaddreviation(),pp.getSupfullname(),pp.getOwner(),pp.getJob(),pp.getMobile(),pp.getSupaddress()};
       //System.out.println(sql);
       return p.update(sql, params);
    }
    
}
