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
public class Product {
    private int proid;
    private String proname;
    private String protype;
    private int storecount;
    private int quantity;
    private BigDecimal suggestbuyprice;
    private BigDecimal suggestsaleprice;
    private Date lastpurchasedate;
    private Date lastdeliverydate;
    private int state;

    public Product() {
    }

    public Product(int proid, String proname, String protype, int storecount, int quantity, BigDecimal suggestbuyprice, BigDecimal suggestsaleprice, Date lastpurchasedate, Date lastdeliverydate) {
        this.proid = proid;
        this.proname = proname;
        this.protype = protype;
        this.storecount = storecount;
        this.quantity = quantity;
        this.suggestbuyprice = suggestbuyprice;
        this.suggestsaleprice = suggestsaleprice;
        this.lastpurchasedate = lastpurchasedate;
        this.lastdeliverydate = lastdeliverydate;
    }



    
    
    

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    public int getStorecount() {
        return storecount;
    }

    public void setStorecount(int storecount) {
        this.storecount = storecount;
    }

    public BigDecimal getSuggestbuyprice() {
        return suggestbuyprice;
    }

    public void setSuggestbuyprice(BigDecimal suggestbuyprice) {
        this.suggestbuyprice = suggestbuyprice;
    }

    public BigDecimal getSuggestsaleprice() {
        return suggestsaleprice;
    }

    public void setSuggestsaleprice(BigDecimal suggestsaleprice) {
        this.suggestsaleprice = suggestsaleprice;
    }

    public Date getLastpurchasedate() {
        return lastpurchasedate;
    }

    public void setLastpurchasedate(Date lastpurchasedate) {
        this.lastpurchasedate = lastpurchasedate;
    }

    public Date getLastdeliverydate() {
        return lastdeliverydate;
    }

    public void setLastdeliverydate(Date lastdeliverydate) {
        this.lastdeliverydate = lastdeliverydate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    } 

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
