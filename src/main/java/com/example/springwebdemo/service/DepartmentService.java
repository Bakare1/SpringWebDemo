package com.example.springwebdemo.service;

import com.example.springwebdemo.Entity.Department;
import com.example.springwebdemo.ErrorHandling.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentID) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentID);

   public Department updateDepartment(Long departmentID, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
