/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.dao.BaseDao;
import elms.dao.productdao;
import elms.dao.purchasedao;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author YukiMuraRindon
 */
public class cgthserviceimpl{
    public boolean purchasereturn(String purid, int proid, int returnnum, Date returntime, String returnreason) {
        boolean result = true;
        //修改采购表的退货数量和退货时间
        String sql1 = "update t_purchase set returnamount=returnamount+?,returndate=?,purnumber=purnumber-? ,returnreason=?,totalmoney=totalmoney-(?*purprice)where purid=?";
        Object[] params1 = {returnnum, returntime, returnnum, returnreason, returnnum, purid};
        String sql2 = "update t_product set quantity= quantity-?  where proid=?";
        Object[] params2 = {returnnum, proid};
        Connection conn = new BaseDao().getConnection();
        try {
            conn.setAutoCommit(false);//启动事务
            purchasedao p = new purchasedao();
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

}
