/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import java.util.Date;

/**
 *
 * @author YukiMuraRindon
 */
public interface cgthservice {
    public boolean purchasereturn(String purid, int proid, int returnnum, Date returntime, String returnreason);
}
