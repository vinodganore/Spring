package com.vinod.ganore.service;

import com.vinod.ganore.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vinod.ganore.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    //Arrays.asList is immutable , which is changed to mutable
    private List<Employee>  employeeList=  new ArrayList<>(Arrays.asList(
            new Employee("S100","Vinod","ILP-2012","JavaTech" ),
                 new Employee("S101","Mahendar","ILP-2012","Spring" ),
                 new Employee("S102","Navi","ILP-2012","Hadoop" ),
                 new Employee("S103","Rao","ILP-2012",".Net" ),
                 new Employee("S104","Hareesh","ILP-2012",".Net")
        ));

    public List<Employee> getAllEmployees()
    {
        System.out.println(" The List of Employees displayed successfully");
        List<Employee> empList = new ArrayList<>();
        employeeRepository.findAll().forEach(empList :: add);

        return empList;
    }

    public Employee getEmployee( String empId)
    {
        return (Employee)employeeRepository.findById(empId).get();
    }

    public void addEmployee(Employee employee)
    {
        System.out.println(" The Employee :"+employee.getEmpName() +" has been Added successfully");
        employeeRepository.save(employee);

    }

    public Employee deleteEmployee(String empId)
    {

        Employee deleteEmployee = getEmployee(empId);
        employeeRepository.delete(deleteEmployee);
        System.out.println(" The Employee :"+deleteEmployee.getEmpName() +" has been deleted successfully");
        return deleteEmployee;
    }

    public List<Employee> updateEmployee(Employee employee , String empId)
    {
        employeeRepository.save(employee);

        return getAllEmployees();

    }
}
