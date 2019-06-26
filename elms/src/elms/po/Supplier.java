/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.po;

/**
 *
 * @author Administrator
 */
public class Supplier {
    private int supid;
    private String supaddreviation;
    private String supfullname;
    private String owner;
    private String job;
    private String mobile;
    private String supaddress;
    private int state;

    public Supplier() {
    }

    public Supplier(int txtsupid, String txtsupaddreviation, String txtsupfullname, String txtowner, String txtjob, String txtmobile, String txtaddress) {
        this.supid = supid;
        this.supaddreviation = supaddreviation;
        this.supfullname = supfullname;
        this.owner = owner;
        this.job = job;
        this.mobile = mobile;
        this.supaddress = supaddress;
    }

    public int getSupid() {
        return supid;
    }

    public void setSupid(int supid) {
        this.supid = supid;
    }

    public String getSupaddreviation() {
        return supaddreviation;
    }

    public void setSupaddreviation(String supaddreviation) {
        this.supaddreviation = supaddreviation;
    }

    public String getSupfullname() {
        return supfullname;
    }

    public void setSupfullname(String supfullname) {
        this.supfullname = supfullname;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSupaddress() {
        return supaddress;
    }

    public void setSupaddress(String supaddress) {
        this.supaddress = supaddress;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
   public String toString(){
        return this.supfullname;
    }
 
    
}
