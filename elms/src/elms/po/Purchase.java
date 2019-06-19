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
public class Purchase {

    private String purid;
    private int proid;
    private int supid;
    private BigDecimal purprice;
    private Date purdate;
    private int purnumber;
    private String unit;
    private BigDecimal totalmoney;
    private int returnamount;
    private Date returndate;
    private String proname;
    private String returnreason;
    private String supfullname;
    private String protype;
    
    private int countnum;
    private BigDecimal countmoney;

    public Purchase() {
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPurid() {
        return purid;
    }

    public void setPurid(String purid) {
        this.purid = purid;
    }


    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public BigDecimal getPurprice() {
        return purprice;
    }

    public void setPurprice(BigDecimal purprice) {
        this.purprice = purprice;
    }

    public Date getPurdate() {
        return purdate;
    }

    public void setPurdate(Date purdate) {
        this.purdate = purdate;
    }

    public int getPurnumber() {
        return purnumber;
    }

    public void setPurnumber(int purnumber) {
        this.purnumber = purnumber;
    }

    public int getReturnamount() {
        return returnamount;
    }

    public void setReturnamount(int returnamount) {
        this.returnamount = returnamount;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }


    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getSupfullname() {
        return supfullname;
    }

    public void setSupfullname(String supfullname) {
        this.supfullname = supfullname;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getReturnreason() {
        return returnreason;
    }

    public void setReturnreason(String returnreason) {
        this.returnreason = returnreason;
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
