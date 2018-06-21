package com.gx.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gx.dao.DepartmentDao;
import com.gx.entity.Department;
import com.gx.mapper.DepartmentMapper;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentDao departmentDao;


  @Autowired
  private DepartmentMapper departmentMapper;

  @Override
  public Department findById(Integer id) {
    return departmentDao.findById(id);
  }

  @Override
  public List<Department> listDepartment() {
    return departmentMapper.listDepartment();
  }

  @Override
  public void insertDepartment(String departmentName) {
    departmentMapper.insertDepartment(departmentName);
  }

}

