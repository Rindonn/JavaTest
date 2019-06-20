/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.util;

/**
 *
 * @author yhy
 */
public class NoUtil {
    //生成采购单号
    public static String createPurno(){
        String purno = "p"+new java.util.Date().getTime();
        return purno;
    }
    //生成采购退货单号
    public static String createPrureturnno(){
        String purreturnno = "pr"+new java.util.Date().getTime();
        return purreturnno;
    }
    //生成销售单号
     public static String createSaleno(){
        String saleno = "s"+new java.util.Date().getTime();
        return saleno;
    }
      //生成销售退货单号
     public static String createSalereturnno(){
        String salereturnno = "sr"+new java.util.Date().getTime();
        return salereturnno;
    }
    public static void main(String[] args) {
        System.out.println(NoUtil.createPrureturnno());
    }
}
