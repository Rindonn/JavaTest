/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.BaseDao;
import elms.dao.productdao;
import elms.dao.selldao;
import elms.po.Sell;
import java.sql.Connection;
import java.util.Date;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public class xsthserviceimpl {
    public boolean xsreturn(String seid, int proid, int sellreturnnum, Date sellreturntime) {
        boolean result = true;
        //修改采购表的退货数量和退货时间
        //如果未退货过，退货数量为空，无法加减数字，所以要加一步检查是否为空，为空则直接设置退货数量。
        //String sql = "select * from t_sell where seid = ?";
       // Object[] params = {seid};
        //selldao p1 = new selldao();
        //Sell s = (Sell) p1.get(sql, Sell.class, params);
        
        
        
        String sql1 = "update t_sell set sellreturndate=?,sellnum=sellnum-?,sellreturnamount = sellreturnamount+? where seid=?";
        Object[] params1 = {sellreturntime, sellreturnnum,sellreturnnum, seid};
        String sql2 = "update t_product set quantity= quantity+?  where proid=?";
        Object[] params2 = {sellreturnnum, proid};
        Connection conn = new BaseDao().getConnection();
        //System.out.println(sql1);
        //System.out.println(sql2);
        try {
            conn.setAutoCommit(false);//启动事务
            selldao p = new selldao();
            productdao pp = new productdao();
            boolean update = p.update(conn, sql1, params1);
            
            boolean update1 = pp.update(conn, sql2, params2);
            conn.commit();
        } catch (Exception e) {
            try {
                result = false;
                conn.rollback();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
}

    public List<Sell> getBySell(String start, String end, String key) {
        selldao s = new selldao();
        String sql = "select * from t_sell s left join t_product pro on pro.proid = s.proid left join t_customer c on s.cusid=c.cusid left join t_employee e on s.uid = e.uid where selldate between ? and ? and concat(cusname,proname) like ?";
        Object[] params = {start,end,"%"+key+"%"};
        return s.query(sql,Sell.class,params);
    }

}
