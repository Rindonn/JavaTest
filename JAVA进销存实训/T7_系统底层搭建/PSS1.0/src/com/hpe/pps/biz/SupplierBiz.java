/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.po.Supplier;
import java.util.List;

/**
 *
 * @author yhy
 */
public interface SupplierBiz {
    //查询所有供应商
    public List<Supplier> findAll();
}
