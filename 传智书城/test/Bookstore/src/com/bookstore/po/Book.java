package com.bookstore.po;

public class Book {
	private String bid;//涓婚敭
	private String bname;//鍥惧悕
	private String author;//浣滆��
	private double price;//瀹氫环
	private double currPrice;//褰撳墠浠�
	private double discount;//鎶樻墸
	private String press;//鍑虹増绀�
	private String publishtime;//鍑虹増鏃堕棿
	private int edition;//鐗堟
	private int pageNum;//椤垫暟
	private int wordNum;//瀛楁暟
	private String printtime;//鍒锋柊鏃堕棿
	private int booksize;//寮�鏈�
	private String paper;//绾歌川
	private String cid;//浜岀骇鍒嗙被缂栧彿
	private String image_w;//澶у浘璺緞
	private String image_b;//灏忓浘璺緞
	private String cname;// 鍒嗙被鍚嶇О
	private String pid;//涓�绾у垎绫荤紪鍙�
	
	public Book() {
		super();
	}
	
	public Book(String bname, String author, double price, double currPrice, double discount, String press,
			String publishtime, int edition, int pageNum, int wordNum, String printtime, int booksize, String paper,
			String cid) {
		super();
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.currPrice = currPrice;
		this.discount = discount;
		this.press = press;
		this.publishtime = publishtime;
		this.edition = edition;
		this.pageNum = pageNum;
		this.wordNum = wordNum;
		this.printtime = printtime;
		this.booksize = booksize;
		this.paper = paper;
		this.cid = cid;
	}

	public Book(String bid, String bname, String author, double price, double currPrice, double discount, String press,
			String publishtime, int edition, int pageNum, int wordNum, String printtime, int booksize, String paper,
			String cid, String image_w, String image_b) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.currPrice = currPrice;
		this.discount = discount;
		this.press = press;
		this.publishtime = publishtime;
		this.edition = edition;
		this.pageNum = pageNum;
		this.wordNum = wordNum;
		this.printtime = printtime;
		this.booksize = booksize;
		this.paper = paper;
		this.cid = cid;
		this.image_w = image_w;
		this.image_b = image_b;
	}


	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCurrPrice() {
		return currPrice;
	}
	public void setCurrPrice(double currPrice) {
		this.currPrice = currPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getPublishtime() {
		return publishtime;
	}
	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getWordNum() {
		return wordNum;
	}
	public void setWordNum(int wordNum) {
		this.wordNum = wordNum;
	}
	public String getPrinttime() {
		return printtime;
	}
	public void setPrinttime(String printtime) {
		this.printtime = printtime;
	}
	public int getBooksize() {
		return booksize;
	}
	public void setBooksize(int booksize) {
		this.booksize = booksize;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getImage_w() {
		return image_w;
	}
	public void setImage_w(String image_w) {
		this.image_w = image_w;
	}
	public String getImage_b() {
		return image_b;
	}
	public void setImage_b(String image_b) {
		this.image_b = image_b;
	}
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
	
	
}
