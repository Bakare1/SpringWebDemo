package com.example.springwebdemo.service;

import com.example.springwebdemo.Entity.Employee;
import com.example.springwebdemo.ErrorHandling.EmployeeNotFoundException;
import com.example.springwebdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public com.example.springwebdemo.Entity.Employee saveEmployee(com.example.springwebdemo.Entity.Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> fetchEmployeeData() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee fetchEmployeeByID(Long empID) throws EmployeeNotFoundException {
        Optional<Employee> employee = employeeRepository.findById(empID);
        if(!employee.isPresent()){
            throw new EmployeeNotFoundException("Employee Data not Found");
        }
        return employee.get();
    }

    @Override
    public void deleteEmployeeByID(Long empID) {
        employeeRepository.deleteById(empID);
    }

    @Override
    public Employee updateEmployee(Long empID, Employee employee) {
        Employee empDB = employeeRepository.findById(empID).get();

        if(Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())){
            empDB.setEmpName(employee.getEmpName());
        }

        if (Objects.nonNull(employee.getEmpAddress()) && !"".equalsIgnoreCase(employee.getEmpAddress())){
            empDB.setEmpAddress(employee.getEmpAddress());
        }

        if(Objects.nonNull(employee.getEmpDOB())){
            empDB.setEmpDOB(employee.getEmpDOB());
        }
        return employeeRepository.save(empDB);
    }

    @Override
    public Employee fetchEmployeeByName(String empName) {
        return employeeRepository.findByEmpNameIgnoreCase(empName);
    }


}
