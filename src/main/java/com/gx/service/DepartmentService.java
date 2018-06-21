package com.gx.service;

import java.util.List;
import com.gx.entity.Department;

public interface DepartmentService {
  public Department findById(Integer id);

  public List<Department> listDepartment();

  public void insertDepartment(String departmentName);
}

