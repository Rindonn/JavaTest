/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayonghao;

import java.util.List;
import util.dbutil;

/**
 *
 * @author YukiMuraRindon
 */
public class zichanimpl {
    dbutil p = new dbutil();
    public List<zichan> findall(){
        String sql = "select * from T_asset";
        Object[] parmas = {};
        //p.query(sql,user.class,null);
        return p.query(sql,zichan.class,null);
    }
    public String findid(String name){
        String sql = "select aid from T_asset where name = ?";
        Object[] params = {name};
        return (String) p.get(sql, zichan.class, params);
    }
    public List<zichan> findname(String name){
        String sql = "select * from T_asset where name like ?";
        Object[] params = {"%"+name+"%"};
        return  p.query(sql, zichan.class, params);
    }
    public boolean insert(String name,String type,int amount,String date,String remark){
        String sql = "insert into T_asset(name,type,amount,inspectTime,remark) values(?,?,?,?,?)";
        Object[] params = {name,type,amount,date,remark};
        boolean flag = p.update(sql,params);
        return flag;
    }
    public boolean update(String name,String type,int amount,String date,String remark,int id){
        String sql = "update T_asset set name=?,type=?,amount=?,inspectTime=?,remark=? where aid=?";
        Object[] params1 = {name,type,amount,date,remark,id};
        boolean flag = p.update(sql,params1);
        return flag;
    }
    public boolean delete(int id){
        String sql = "delete from T_asset where aid =?";
        Object[] params1 = {id};
        boolean flag = p.update(sql,params1);
        return flag;
    }
}
