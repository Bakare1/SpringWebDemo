package com.example.springwebdemo.repository;

import com.example.springwebdemo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByEmpNameIgnoreCase (String empName);
}
