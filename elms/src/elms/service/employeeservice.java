/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elms.service;

import elms.po.Employee;
import java.util.List;

/**
 *
 * @author YukiMuraRindon
 */
public interface employeeservice {
    public List<Employee> findAll();
}
