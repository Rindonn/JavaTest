/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.po.Purchase;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public interface purchaseservice {
    public boolean purchaseIn(Object[][] product,Object[][] purchase);
    public List<Purchase> getByPurchase(String start,String end,String key);
}
