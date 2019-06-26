/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.bin.elmsJFrame;
import elms.dao.employeedao;
import elms.po.*;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class employeeserviceimpl {
    employeedao p = new employeedao();
    public List<Employee> findAll(){
        String sql = "select * from t_employee where state = 1";
        Object[] parmas = {};
        return p.query(sql,Employee.class,parmas);
}
    public boolean update(Employee pp) {
       String sql = "update t_employee set username=?,password=?,truename=?,position=?,phone=?,cid=? where uid=?";
       Object[] params = {pp.getUsername(),pp.getPassword(),pp.getTruename(),pp.getPosition(),pp.getPhone(),pp.getCid(),pp.getUid()};
       return p.update(sql, params);
    }
    
    public boolean delete(int id){
        String sql = "update t_employee set state= -1  where uid=?";
        Object[] parmas = {id};
        return p.update(sql,parmas);
    }
    public boolean insert(Employee pp) {
       String sql = "insert into t_employee (uid,username,password,truename,position,phone,cid) values(?,?,?,?,?,?,?)";
       Object[] params = {pp.getUid(),pp.getUsername(),pp.getPassword(),pp.getTruename(),pp.getPosition(),pp.getPhone(),pp.getCid()};
       //System.out.println(sql);
       return p.update(sql, params);
    }
    
    public List<Employee> select(String username){
        String sql = "select * from t_employee where username = ? and state = 1";
        Object[] parmas = {username};
        return p.query(sql,Employee.class,parmas);
}
    public Employee login(String username,String password){
        String sql = "select * from t_employee where username = ? and password = ? and state = 1";
        Object[] params={username,password};
        Employee e = (Employee) p.get(sql, Employee.class, params);
        elmsJFrame.empp = e;
        return e;
    }
}
