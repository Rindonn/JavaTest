/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.po;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Sell {

    private String seid;
    private int proid;
    private int cusid;
    private int uid;
    private BigDecimal sellprice;
    private Date selldate;
    private int sellnum;
    private int sellreturnamount;
    private Date sellreturndate;
    private String truename;
    private String proname;
    private String cusname;
    private BigDecimal price;
    private int countnum;
    private BigDecimal countmoney;
    private String protype;

    public Sell() {
    }

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }


    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public Date getSelldate() {
        return selldate;
    }

    public void setSelldate(Date selldate) {
        this.selldate = selldate;
    }

    public int getSellnum() {
        return sellnum;
    }

    public void setSellnum(int sellnum) {
        this.sellnum = sellnum;
    }

    public int getSellreturnamount() {
        return sellreturnamount;
    }

    public void setSellreturnamount(int sellreturnamount) {
        this.sellreturnamount = sellreturnamount;
    }

    public Date getSellreturndate() {
        return sellreturndate;
    }

    public void setSellreturndate(Date sellreturndate) {
        this.sellreturndate = sellreturndate;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCountnum() {
        return countnum;
    }

    public void setCountnum(int countnum) {
        this.countnum = countnum;
    }

    public BigDecimal getCountmoney() {
        return countmoney;
    }

    public void setCountmoney(BigDecimal countmoney) {
        this.countmoney = countmoney;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }
    
}
