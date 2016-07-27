/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.EMS.Rupa.Employee.DAO.Impl;

import Com.EMS.Rupa.Employee.DAO.EmployeeDAO;
import Com.EMS.Rupa.Employee.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

    private int counter = 0;
    private Employee[] employeelist = new Employee[7];

    @Override
    public boolean insert(Employee e) {
        if (counter == employeelist.length) {
            return false;
        }
        employeelist[counter] = e;
        counter++;
        return true;

    }

    @Override
    public boolean update(Employee e) {
        return true;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < employeelist.length; i++) {
            Employee e = employeelist[i];
            if (e != null && e.getId() == id) {
                employeelist[i] = null;
                return true;
            }

        }
        return false;
    }

    @Override
    public Employee getById(int id) {
        for (int i = 0; i < employeelist.length; i++) {
            Employee e = employeelist[i];
            if (e != null && e.getId() == id) {

                return e;
            }
        }
        return null;
    }

    @Override
    public Employee[] getAll() {
        return employeelist;
    }

   
    }

   

