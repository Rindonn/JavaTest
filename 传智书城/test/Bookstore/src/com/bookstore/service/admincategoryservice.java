package com.bookstore.service;


import java.util.List;

import com.bookstore.dao.admincategorydao;
import com.bookstore.po.*;

public class admincategoryservice {
	admincategorydao c = new admincategorydao();
	public List<Category> findall(){
		String sql = "select * from t_category where pid is null order by orderBy";
		Object[] params = {};
		List<Category> p = c.query(sql, Category.class, params);
		for(Category c : p) {
			List<Category> child = findbyparent(c.getCid());
			c.setChildren(child);
			
		}
		return p;
	}

	public List<Category> findbyparent(String pid){
		String sql = "select * from t_category where pid =? order by  orderBy";
		Object[] params = {pid};
		List<Category> p = c.query(sql, Category.class, params);
		return p;
	}

	public void addParent(Category cc) {
		String sql = "insert into t_category (cid,cname,pid,`desc`) values(?,?,?,?)";
		String pid = null;
		if(cc.getPid()!=null) {
			pid=cc.getPid();
		}
		Object[] params = {cc.getCid(),cc.getCname(),pid,cc.getDesc()};
		c.update(sql, params);
	}

	public List<Category> findbyparents() {
		String sql = "select * from t_category where pid is null order by orderBy";
		Object[] params = {};
		List<Category> p = c.query(sql, Category.class, params);
		return p;
	}
	public Category load(String cid) {
		String sql = "select * from t_category where cid=?";
		Object[] params = {cid};
		return (Category) c.get(sql, Category.class, params);
	}
	public void edit(Category cc) {
		String sql = "update t_category set cname=?,pid=?,`desc`=? where cid = ?";
		String pid = null;
		if(cc.getPid()!=null) {
			pid=cc.getPid();
		}
		Object[] params = {cc.getCname(),pid,cc.getDesc(),cc.getCid()};
		c.update(sql, params);
	}
	public int findChildrenCategoryByParent(String pid) {
		String sql = "select count(*) from t_category where pid=?";
		Object[] params= {pid};
		Number num = c.getCount(sql, params);
		return num == null ? 0 : num.intValue();
	}
	public void delete(String id) {
		String sql = "delete from t_category where cid =?";
		Object[] params= {id};
		c.update(sql, params);
	}
}
