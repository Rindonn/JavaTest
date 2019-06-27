/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.po;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author yhy
 */
public class Product {
    private Integer pid;
    private String pname;
    private String ptype;
    private Integer safeamount;
    private BigDecimal suggestpurchaseprice;
    private BigDecimal suggestsaleprice;
    private Integer currentamount;
    private Date lastpurchasetime;
    private Date lastsaletime;
    private Integer state;
    public Product() {
    }

    public Product(String pname,String ptype, Integer safeamount, BigDecimal suggestpurchaseprice, BigDecimal suggestsaleprice) {
        this.pname = pname;
        this.ptype = ptype;
        this.safeamount = safeamount;
        this.suggestpurchaseprice = suggestpurchaseprice;
        this.suggestsaleprice = suggestsaleprice;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getSafeamount() {
        return safeamount;
    }

    public void setSafeamount(Integer safeamount) {
        this.safeamount = safeamount;
    }

    public BigDecimal getSuggestpurchaseprice() {
        return suggestpurchaseprice;
    }

    public void setSuggestpurchaseprice(BigDecimal suggestpurchaseprice) {
        this.suggestpurchaseprice = suggestpurchaseprice;
    }

    public BigDecimal getSuggestsaleprice() {
        return suggestsaleprice;
    }

    public void setSuggestsaleprice(BigDecimal suggestsaleprice) {
        this.suggestsaleprice = suggestsaleprice;
    }

    public Integer getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(Integer currentamount) {
        this.currentamount = currentamount;
    }

    public Date getLastpurchasetime() {
        return lastpurchasetime;
    }

    public void setLastpurchasetime(Date lastpurchasetime) {
        this.lastpurchasetime = lastpurchasetime;
    }

    public Date getLastsaletime() {
        return lastsaletime;
    }

    public void setLastsaletime(Date lastsaletime) {
        this.lastsaletime = lastsaletime;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", safeamount=" + safeamount + ", suggestpurchaseprice=" + suggestpurchaseprice + ", suggestsaleprice=" + suggestsaleprice + ", currentamount=" + currentamount + ", lastpurchasetime=" + lastpurchasetime + ", lastsaletime=" + lastsaletime + '}';
    }
   
   
    
}
