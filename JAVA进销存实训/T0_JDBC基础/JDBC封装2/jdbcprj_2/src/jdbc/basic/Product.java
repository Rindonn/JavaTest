/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.basic;

import java.math.BigDecimal;

/**
 * 实体bean 
 * @author yhy
 */
public class Product {
    private int pid;  
    private String pname;
    private String supplier;
    private BigDecimal price;
    private int state;

    public Product(String pname, String supplier, BigDecimal price) {
        this.pname = pname;
        this.supplier = supplier;
        this.price = price;
    }

    public Product(int pid, String pname, String supplier, BigDecimal price) {
        this.pid = pid;
        this.pname = pname;
        this.supplier = supplier;
        this.price = price;
    }

    public Product() {
    }
    
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pname=" + pname + ", supplier=" + supplier + ", price=" + price + ", state=" + state + '}';
    }

   
}
