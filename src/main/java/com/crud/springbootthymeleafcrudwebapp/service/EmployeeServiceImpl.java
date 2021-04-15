package com.crud.springbootthymeleafcrudwebapp.service;

import com.crud.springbootthymeleafcrudwebapp.model.Employee;
import com.crud.springbootthymeleafcrudwebapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> getallemployees() {
        return repository.findAll();
    }

    @Override
    public void saveemployee(Employee employee) {
        repository.save(employee);

    }

    @Override
    public Employee getemployeebyid(Long id) {
        Optional<Employee> optional = repository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee not found for id " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        repository.deleteById(id);
    }
}
