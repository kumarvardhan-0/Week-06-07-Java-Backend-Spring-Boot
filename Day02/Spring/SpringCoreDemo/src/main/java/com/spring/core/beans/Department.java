package com.spring.core.beans;

import org.springframework.stereotype.Component;

@Component  
public class Department {
    private String departmentName;

    public Department() {
        this.departmentName = "Engineering";
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void printDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
    }
}
