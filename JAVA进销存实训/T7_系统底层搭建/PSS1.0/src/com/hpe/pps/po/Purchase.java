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
public class Purchase {
    private Integer purid;
    private String purno;
    private Integer pid;
    private Integer purchaseamount;
    private BigDecimal purchaseprice;
    private Integer supplierid;
    private Date purchasedate;
    private Integer state;

    public Purchase() {
    }

    public Purchase(String purno, Integer pid, Integer purchaseamount, BigDecimal purchaseprice, Integer supplierid, Date purchasedate) {
        this.purno = purno;
        this.pid = pid;
        this.purchaseamount = purchaseamount;
        this.purchaseprice = purchaseprice;
        this.supplierid = supplierid;
        this.purchasedate = purchasedate;
    }
    
    
    
    public Integer getPurid() {
        return purid;
    }

    public void setPurid(Integer purid) {
        this.purid = purid;
    }

    public String getPurno() {
        return purno;
    }

    public void setPurno(String purno) {
        this.purno = purno;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(Integer purchaseamount) {
        this.purchaseamount = purchaseamount;
    }

    public BigDecimal getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(BigDecimal purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    
    
}
