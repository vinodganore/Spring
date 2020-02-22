package com.vinod.ganore.model;


import org.springframework.boot.jackson.JsonComponent;

import java.io.Serializable;


public class Employee implements Serializable {
    private  String empId;
    private  String empName;
    private  String empBatch;
    private  String empTech;

    public Employee() {
    }
    public Employee(String empId, String empName, String empBatch, String empTech) {

        this.empId=empId;
        this.empName=empName;
        this.empBatch=empBatch;
        this.empTech=empTech;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpBatch() {
        return empBatch;
    }

    public void setEmpBatch(String empBatch) {
        this.empBatch = empBatch;
    }

    public String getEmpTech() {
        return empTech;
    }

    public void setEmpTech(String empTech) {
        this.empTech = empTech;
    }
}
