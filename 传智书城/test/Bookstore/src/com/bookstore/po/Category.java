package com.bookstore.po;

import java.util.List; 

/**
 * 鍒嗙被妯″潡鐨勫疄浣撶被
 * 
 * @author qdmmy6
 * 
 */
public class Category {
	private String cid;// 涓婚敭
	private String cname;// 鍒嗙被鍚嶇О
	private String pid;// 鐖跺垎绫�
	private String desc;// 鍒嗙被鎻忚堪
	private List<Category> children;// 瀛愬垎绫�

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public List<Category> getChildren() {
		return children;
	}

	public void setChildren(List<Category> children) {
		this.children = children;
	}
}
