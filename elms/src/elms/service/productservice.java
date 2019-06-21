/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;
import elms.po.Product;
import java.util.List;
/**
 *
 * @author YukiMuraRindon
 */
public interface productservice{
    public List<Product> findAll();
     public List<Product> findAll(String key);
}
