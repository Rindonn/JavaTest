/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.vo.ViewPurchase;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author yhy
 */
public interface PurchaseBiz {
    //采购入库
    public boolean purchasein(Object[][] purchases,Object[][] stocks);
    // 查询采购单
    public List<ViewPurchase> findByCondition(String start,String end,String conditions);
    //采购退货
    public boolean purchasereturn(Object[][] purchasereturn,Object[][] stocks);
    //采购退货2
    public boolean purchasereturn(int purid,int returnamont,Date returntime,int pid);
}
