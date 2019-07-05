package com.bookstore.util;

import java.util.List;

/**
 * 鍒嗛〉Bean锛屽畠浼氬湪鍚勫眰涔嬮棿浼狅拷?锟斤紒
 * @author qdmmy6
 *
 * @param <T>
 */
public class PageBean<T> {
	private int pc;//褰撳墠椤电爜
	private int tr;//鎬昏褰曟暟
	private int ps;//姣忛〉璁板綍鏁�
	private String url;//璇锋眰璺緞鍜屽弬鏁�
	private List<T> beanList;
	
	// 璁＄畻鎬婚〉鏁�
	public int getTp() {
		int tp = tr / ps;
		return tr % ps == 0 ? tp : tp + 1;
	}
	
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getTr() {
		return tr;
	}
	public void setTr(int tr) {
		this.tr = tr;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}
}
