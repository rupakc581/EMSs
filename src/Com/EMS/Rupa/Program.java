/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.EMS.Rupa;

import Com.EMS.Rupa.Employee.DAO.EmployeeDAO;
import Com.EMS.Rupa.Employee.DAO.Impl.EmployeeDAOImpl;
import Com.EMS.Rupa.Employee.Employee;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        EmployeeDAO employeesDAO = new EmployeeDAOImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1 Add Employee");
            System.out.println("2 Delete Employee");
            System.out.println("3 Show All");
            System.out.println("4 Search Employee");
            System.out.println("5 Exit");
            System.out.println("Enter your choice (1-5)");
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Add Employee");
                    Employee e = new Employee();
                    System.out.println("Enter id");
                    e.setId(input.nextInt());
                    System.out.println("Enter name");
                    e.setName(input.next());
                    System.out.println("Enter type");
                    e.setType(input.next());
                    System.out.println("Enter salary");
                    e.setSalary(input.nextDouble());

                    if (employeesDAO.insert(e)) {
                        System.out.println("inserted sucessfully");
                    } else {
                        System.out.println("data full");
                    }
                    break;

                case 2:

                    System.out.println("Enter id to delete particular employee detail");
                    int id = input.nextInt();
                    if (employeesDAO.delete(id)) {
                        System.out.println("deleted sucessfully");
                    }

                    break;

                case 3:

                    System.out.println("List of all Employee");
                    Employee[] employees = employeesDAO.getAll();
                    for (int i = 0; i < employees.length; i++) {
                        Employee Employee = employees[i];
                        if (Employee != null) {
                            System.out.println("id: " + Employee.getId());
                            System.out.println("Name: " + Employee.getName());
                            System.out.println("Type: " + Employee.getType());
                            System.out.println("Salary: " + Employee.getSalary());
                        }
                        break;
                    }
                
                    
                case 4:
                    System.out.println("Enter id to search employee");
                     id = input.nextInt();
                     Employee Employee =employeesDAO.getById(id);
                     if (Employee != null) {
                            System.out.println("id: " + Employee.getId());
                            System.out.println("Name: " + Employee.getName());
                            System.out.println("Type: " + Employee.getType());
                            System.out.println("Salary: " + Employee.getSalary());
                        }
                    break;
                    
                    case 5:
                    System.out.println("Do you really want to exit?[Y/N]");
                    if (input.next().equalsIgnoreCase("y")) {
                        
                        System.exit(0);

                    }
                    break;
                    

            }
        }

    }
}
