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
    private String owmer;
    private String job;
    private String modile;
    private String supaddress;
    private int state;

    public Supplier() {
    }

    public Supplier(int supid, String supaddreviation, String supfullname, String owmer, String job, String modile, String supaddress) {
        this.supid = supid;
        this.supaddreviation = supaddreviation;
        this.supfullname = supfullname;
        this.owmer = owmer;
        this.job = job;
        this.modile = modile;
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

    public String getOwmer() {
        return owmer;
    }

    public void setOwmer(String owmer) {
        this.owmer = owmer;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getModile() {
        return modile;
    }

    public void setModile(String modile) {
        this.modile = modile;
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
