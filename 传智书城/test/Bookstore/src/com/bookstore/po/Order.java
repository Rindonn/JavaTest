package com.bookstore.po;

import java.util.List;


public class Order {
	private String oid;//涓婚敭
	private String ordertime;//涓嬪崟鏃堕棿
	private double total;//鎬昏
	private int status;//璁㈠崟鐘舵�侊細1鏈粯娆�, 2宸蹭粯娆句絾鏈彂璐�, 3宸插彂璐ф湭纭鏀惰揣, 4纭鏀惰揣浜嗕氦鏄撴垚鍔�, 5宸插彇娑�(鍙湁鏈粯娆炬墠鑳藉彇娑�)
	private String address;//鏀惰揣鍦板潃
	private User owner;//璁㈠崟鐨勬墍鏈夎��
	
	private List<OrderItem> orderItemList;
	
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
}
