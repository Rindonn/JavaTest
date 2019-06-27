/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hpe.pps.biz;

import com.hpe.pps.dao.SupplierDao;
import com.hpe.pps.po.Supplier;
import java.util.List;

/**
 *
 * @author yhy
 */
public class SupplierBizImpl implements SupplierBiz{
    SupplierDao supdao = new SupplierDao();
    @Override
    public List<Supplier> findAll() {
        String sql = "select * from supplier where state = 1";
        return supdao.query(sql, Supplier.class);
    }
    
}
