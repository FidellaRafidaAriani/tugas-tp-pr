/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee;

/**
 *
 * @author FIDELLA
 */
import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.EmployeeService;

public class Main {
    public static void main(String[] args) {

        Department it = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full Time");

        Employee emp1 = new Employee(1, "Andi", it, fullTime, 5000000);
        Employee emp2 = new Employee(2, "Budi", it, fullTime, 6000000);

        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        service.raiseSalary(1, 10);

        System.out.println("Total Employee: " + Employee.getEmployeeCount());
        System.out.println("Gaji Andi setelah kenaikan: " + emp1.getSalary());
    }
}