package com.gx.service;

import java.util.List;
import com.gx.entity.Department;

public interface DepartmentService {
  Department findById(Integer id);

  List<Department> listDepartment();

  void insertDepartment(String departmentName);
}

