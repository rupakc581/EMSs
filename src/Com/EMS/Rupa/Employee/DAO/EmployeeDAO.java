/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Com.EMS.Rupa.Employee.DAO;

import Com.EMS.Rupa.Employee.Employee;

/**
 *
 * @author ACER
 */
public interface EmployeeDAO {
    boolean insert (Employee e);
    boolean update (Employee e);
    boolean delete (int id);
    Employee getById(int id);
    Employee[] getAll();
    
    
}
