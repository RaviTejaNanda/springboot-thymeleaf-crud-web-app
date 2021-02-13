package com.crud.springbootthymeleafcrudwebapp.repository;

import com.crud.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
