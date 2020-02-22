package com.vinod.ganore.dao;

import com.vinod.ganore.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee , String>
{


}
