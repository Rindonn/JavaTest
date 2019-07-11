package service;

import dao.BaseDao;
import object.user;

public class loginservice {
	public user login(user u) {
		//System.out.print("++++++++++++++++++++++++++"+"123");
		BaseDao<user> b = new BaseDao<user>();
		String sql ="select * from test where username = ? and password = ?";
		Object[] params = {u.getusername(),u.getpassword()};
		//System.out.print("++++++++++++++++++++++++++"+"12322");
		return (user) b.get(sql,user.class,params);
	}
}
