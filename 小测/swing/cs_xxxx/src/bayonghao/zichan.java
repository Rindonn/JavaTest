/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bayonghao;

/**
 *
 * @author YukiMuraRindon
 */
public class zichan{
    private int aid;
    private String name;
    private String type;
    private int amount;
    private String inspectTime;
    private String remark;
    
    public zichan(int aid,String name,String type,int amount,String inspectTime,String remark){
        this.aid = aid;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.inspectTime = inspectTime;
        this.remark = remark;
    }
    public zichan(){
        
    }
    public int getaid(){
        return aid;
    }
    public String getname(){
        return name;
    }
    public String gettype(){
        return type;
    }
    public int getamount(){
        return amount;
    }
    public String getinspectTime(){
        return inspectTime;
    }
    public String remark(){
        return remark;
    }
    public void setaid(int aid) {
        this.aid = aid;
    }
    public void setname(String name){
        this.name = name;
    }
    public void settype(String type){
        this.type = type;
    }
    public void setamount(int amount){
        this.amount = amount;
    }
    public void setinspectTime(String inspectTime){
        this.inspectTime = inspectTime;
    }
    public void setremark(String remark){
        this.remark = remark;
    }
}
