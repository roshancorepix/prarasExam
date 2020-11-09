package com.example.parasexternal;

public class Employee {
    private String empName;
    private String salary;
    private int id;

    public Employee() {
    }

    public Employee(String empName, String salary, int id) {
        this.empName = empName;
        this.salary = salary;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
