/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.view;



/**
 *
 * @author yhy
 */
public class ProductSale {
    private String pname;
    private Double firstmonth;
    private Double secondmonth;
    private Double thirdmonth;

    public ProductSale() {
    }

    public ProductSale(String pname, Double firstmonth, Double secondmonth, Double thirdmonth) {
        this.pname = pname;
        this.firstmonth = firstmonth;
        this.secondmonth = secondmonth;
        this.thirdmonth = thirdmonth;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Double getFirstmonth() {
        return firstmonth;
    }

    public void setFirstmonth(Double firstmonth) {
        this.firstmonth = firstmonth;
    }

    public Double getSecondmonth() {
        return secondmonth;
    }

    public void setSecondmonth(Double secondmonth) {
        this.secondmonth = secondmonth;
    }

    public Double getThirdmonth() {
        return thirdmonth;
    }

    public void setThirdmonth(Double thirdmonth) {
        this.thirdmonth = thirdmonth;
    }

  

}