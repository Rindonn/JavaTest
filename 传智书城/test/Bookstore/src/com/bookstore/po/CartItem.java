package com.bookstore.po;

import java.math.BigDecimal;

public class CartItem {
	private String cartItemId;// 涓婚敭
	private int quantity;// 鏁伴噺
	private String bid;// 鏉＄洰瀵瑰簲鐨勫浘涔�
	private String uid;// 鎵�灞炵敤鎴�
	private double currPrice;//褰撳墠浠�
	private String bname;//鍥惧悕
	private String image_b;//灏忓浘璺緞
	// 娣诲姞灏忚鏂规硶
	public double getSubtotal() {

		BigDecimal b1 = new BigDecimal(currPrice+ "");
		BigDecimal b2 = new BigDecimal(quantity + "");
		BigDecimal b3 = b1.multiply(b2);
		return b3.doubleValue();
	}

	public String getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Double getCurrPrice() {
		return currPrice;
	}

	public void setCurrPrice(Double currPrice) {
		this.currPrice = currPrice;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getImage_b() {
		return image_b;
	}

	public void setImage_b(String image_b) {
		this.image_b = image_b;
	}

	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}
	


}
