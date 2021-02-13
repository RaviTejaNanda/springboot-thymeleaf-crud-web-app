package com.crud.springbootthymeleafcrudwebapp.service;

import com.crud.springbootthymeleafcrudwebapp.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getallemployees();
    void saveemployee(Employee employee);
Employee getemployeebyid(Long  id);
void deleteEmployeeById(long id);
}
