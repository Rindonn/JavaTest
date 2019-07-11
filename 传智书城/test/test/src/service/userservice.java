package service;

import java.util.List;

import dao.BaseDao;
import object.user;

public class userservice {
	BaseDao b = new BaseDao();
	public List<user> findall() {
		String sql = "select * from test";
		List<user> l = b.query(sql, user.class, null);
		return l;
	}
}
