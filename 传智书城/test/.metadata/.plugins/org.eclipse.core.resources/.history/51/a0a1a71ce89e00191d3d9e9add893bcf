package com.bookstore.service;

import com.bookstore.dao.adminbookdao;

public class adminbookservice {
	adminbookdao a = new adminbookdao();
	public int findbookcountbyparent(String cid) {
		String sql = "select count(*) from t_book where cid = ?";
		Object[] params= {cid};
		Number num = a.getCount(sql, params);
		return num == null ? 0 : num.intValue();
	}
}
