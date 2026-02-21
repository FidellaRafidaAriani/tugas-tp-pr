/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.polban.employee.model;

/**
 *
 * @author FIDELLA
 */
public class Employee {

    private static int employeeCount = 0;   // STATIC FIELD

    private int id;
    private String name;
    private Department department;
    private EmploymentType type;
    private double salary;

    public Employee(int id, String name, Department department,
                    EmploymentType type, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.type = type;
        this.salary = salary;
        employeeCount++; // setiap object dibuat, count bertambah
    }

    // STATIC METHOD
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Department getDepartment() { return department; }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public EmploymentType getType() { return type; }
    public void setType(EmploymentType type) {
        this.type = type;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}