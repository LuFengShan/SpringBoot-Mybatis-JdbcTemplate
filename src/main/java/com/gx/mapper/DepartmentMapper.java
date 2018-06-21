package com.gx.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.gx.entity.Department;

// @Mapper或者@MapperScan将接口扫描装配到容器中,启动类上面已经使用了@MapperScan了，这个地方可以省略
public interface DepartmentMapper {

  @Select("SELECT * FROM department")
  public List<Department> listDepartment();

  public void insertDepartment(String departmentName);
}

