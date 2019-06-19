/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.po;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Customer {
    private int cusid;
    private int uid;
    private String cusname;
    private String taobaoid;
    private String cusphone;
    private String postcard;
    private String cusaddress;
    private Date lastdeliverydate;
    private int state;
    private String truename;

    public Customer() {
    }

    public Customer(int cusid, int uid, String cusname, String taobaoid, String cusphone, String postcard, String cusaddress) {
        this.cusid = cusid;
        this.uid = uid;
        this.cusname = cusname;
        this.taobaoid = taobaoid;
        this.cusphone = cusphone;
        this.postcard = postcard;
        this.cusaddress = cusaddress;
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

    public String getCusname() {
        return cusname;
    }

    public void setCusname(String cusname) {
        this.cusname = cusname;
    }

    public String getTaobaoid() {
        return taobaoid;
    }

    public void setTaobaoid(String taobaoid) {
        this.taobaoid = taobaoid;
    }

    public String getCusphone() {
        return cusphone;
    }

    public void setCusphone(String cusphone) {
        this.cusphone = cusphone;
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard;
    }

    public String getCusaddress() {
        return cusaddress;
    }

    public void setCusaddress(String cusaddress) {
        this.cusaddress = cusaddress;
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

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    @Override
    public String toString() {
        return this.cusname;
    }
    
}
