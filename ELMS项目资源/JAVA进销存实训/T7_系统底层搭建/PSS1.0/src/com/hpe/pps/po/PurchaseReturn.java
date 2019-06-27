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
public class PurchaseReturn {
    private Integer purreturnid;
    private String purreturnno;
    private String purno;
    private Integer pid;
    private Integer supplierid;
    private Integer returnamount;
    private Date returndate;
    private Integer state;

    public PurchaseReturn() {
    }

    public PurchaseReturn(String purreturnno, String purno, Integer pid, Integer supplierid, Integer returnamount, Date returndate) {
        this.purreturnno = purreturnno;
        this.purno = purno;
        this.pid = pid;
        this.supplierid = supplierid;
        this.returnamount = returnamount;
        this.returndate = returndate;
    }
    
    
}
