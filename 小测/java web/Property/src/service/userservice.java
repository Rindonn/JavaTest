package service;

import java.util.List;

import dao.BaseDao;
import po.user;


public class userservice {
	BaseDao<user> b = new BaseDao<user>();
	public List<user> findall() {
		String sql = "select * from t_house";
		List<user> l = b.query(sql, user.class, null);
		return l;
	}
	public List<user> finduser(String name){
		String sql = "select * from t_house where name like ?";
		name = "%"+name+"%";
		//System.out.print(name);
		Object[] params= {name};
		List<user> l = b.query(sql, user.class, params);
		return l;
	}
	public boolean insert(String name,String tel,int bno,int unit,String roomno) {
		String sql = "insert into t_house (name,phone,buildingno,unit,roomno,state) values(?,?,?,?,?,?)";
		Object[] params= {name,tel,bno,unit,roomno,"1"};
		return b.update(sql, params);
	}
}
