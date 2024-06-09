package com.example.springwebdemo.Controller;

import com.example.springwebdemo.Entity.Employee;
import com.example.springwebdemo.ErrorHandling.EmployeeNotFoundException;
import com.example.springwebdemo.service.EmployeeService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    private final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    @PostMapping("/employee")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        LOGGER.info("In The saveEmployee Controller");
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employee")
    public List<Employee> fetchEmployeeData(){
        LOGGER.info("In The fetchEmployeeData Controller");
        return  employeeService.fetchEmployeeData();
    }

    @GetMapping("/employee/{id}")
    public Employee fetchEmployeeByID(@PathVariable ("id") Long empID) throws EmployeeNotFoundException {
        return employeeService.fetchEmployeeByID(empID);
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeByID(@PathVariable("id") Long empID){
        employeeService.deleteEmployeeByID(empID);
        return "Record Deleted Successfully";
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long empID,@RequestBody Employee employee){
        return employeeService.updateEmployee(empID,employee);
    }

    @GetMapping("/employee/name/{name}")
    public Employee fetchEmployeeByName(@PathVariable("name") String empName){
        return employeeService.fetchEmployeeByName(empName);
    }
}
