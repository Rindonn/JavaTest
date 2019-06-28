/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.po;

import java.sql.Date;

/**
 *
 * @author yhy
 */
public class Supplier {
    private Integer supplierid;
    private String supname;
    private String owner;
    private String job;
    private String telephone;
    private String mobile;
    private String fax;
    private String supaddress;
    private Date lastpurchasedate;
    private Integer state;
    public Supplier() {
    }

    public Supplier(String supname, String owner, String job, String telephone, String mobile, String fax, String supaddress) {
        this.supname = supname;
        this.owner = owner;
        this.job = job;
        this.telephone = telephone;
        this.mobile = mobile;
        this.fax = fax;
        this.supaddress = supaddress;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSupname() {
        return supname;
    }

    public void setSupname(String supname) {
        this.supname = supname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress;
    }

    public Date getLastpurchasedate() {
        return lastpurchasedate;
    }

    public void setLastpurchasedate(Date lastpurchasedate) {
        this.lastpurchasedate = lastpurchasedate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
    public String toString(){
        return this.supname; //提供显示供应商名
    }
    public static void main(String[] args) {
        Supplier s = new Supplier();
        s.setSupplierid(1);
        s.setSupname("华为");
      
        System.out.println(s);
    }
}
