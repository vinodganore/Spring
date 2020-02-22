package com.vinod.ganore.service;

import org.springframework.stereotype.Service;
import com.vinod.ganore.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

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
        return employeeList;
    }

    public Employee getEmployee( String empId)
    {
        return employeeList.stream().filter(t -> t.getEmpId().equals(empId)).findFirst().get();
    }

    public void addEmployee(Employee employee)
    {
        System.out.println(" The Employee :"+employee.getEmpName() +" has been Added successfully");
        employeeList.add(employee);
    }

    public Employee deleteEmployee(String empId)
    {
        Employee deleteEmployee = employeeList.stream().filter(t ->t.getEmpId().equals(empId)).findFirst().get();
        employeeList.remove(deleteEmployee);
        System.out.println(" The Employee :"+deleteEmployee.getEmpName() +" has been deleted successfully");
        return deleteEmployee;
       // employeeList.removeIf(t ->t.getEmpId().equals(empId));
    }

    public List<Employee> updateEmployee(Employee employee , String empId)
    {
        for(int i=0 ; i<employeeList.size();i++)
        {
            if(empId.equals(employeeList.get(i).getEmpId()))
            {
                employeeList.set(i,employee);
                System.out.println(" Employee : "+employee.getEmpId() + "has been updated successfully" );
                return employeeList;
            }
        }
       return null;
    }
}
