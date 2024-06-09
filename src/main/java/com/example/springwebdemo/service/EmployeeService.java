package com.example.springwebdemo.service;

import com.example.springwebdemo.Entity.Employee;
import com.example.springwebdemo.ErrorHandling.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {
  public Employee saveEmployee(Employee employee);

  public List<Employee> fetchEmployeeData();

  public Employee fetchEmployeeByID(Long empID) throws EmployeeNotFoundException;

  public void deleteEmployeeByID(Long empID);

  public Employee updateEmployee(Long empID, Employee employee);

  public Employee fetchEmployeeByName(String empName);
}
