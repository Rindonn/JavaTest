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
public class Employee {
    private int uid;
    private String username;
    private String password;
    private String truename;
    private String position;
    private String phone;
    private String cid;
    private int state;

    public Employee() {
    }

    public Employee(int uid, String username, String password, String truename, String position, String phone, String cid) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.truename = truename;
        this.position = position;
        this.phone = phone;
        this.cid = cid;
    }
    
    

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return this.truename;
    }
    
    
}
