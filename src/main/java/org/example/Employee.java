package org.example;

public class Employee {
    private int empId;
    private String name;

    public int getEmpId{
        return empId;
    }
    public String getName(){
        return name;
    }

    public Employee(int empId, String name, int getEmpId) {
        this.empId = empId;
        this.name = name;
        this.getEmpId = getEmpId;
    }
}
