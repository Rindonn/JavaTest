/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.selldao;
import elms.po.Sell;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class sellserviceimpl {
    public List<Sell> findAll() {
        selldao s = new selldao();
        String sql = "select * from t_sell s left join t_product pro on pro.proid = s.proid left join t_customer c on s.cusid=c.cusid left join t_employee e on s.uid = e.uid;";
        Object[] params = {};
        return s.query(sql,Sell.class,params);
        
    }
}
