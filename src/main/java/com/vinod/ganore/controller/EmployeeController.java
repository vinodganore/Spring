package com.vinod.ganore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.vinod.ganore.model.Employee;
import com.vinod.ganore.service.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> getAllEmployees()

    {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(value = "/employees/{empId}" , method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable String empId)
    {
        return employeeService.getEmployee(empId);
    }

    @RequestMapping(value = "/employees" , method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(value = "/employees/{empId}" , method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public Employee deleteEmployee(@PathVariable String empId)
    {
        return employeeService.deleteEmployee(empId);
    }

    @RequestMapping(value = "/employees/{empId}" , method = RequestMethod.PUT)
    public List<Employee> updateEmployee(@RequestBody Employee employee ,@PathVariable String empId)
    {
        return employeeService.updateEmployee(employee,empId);
    }

}
