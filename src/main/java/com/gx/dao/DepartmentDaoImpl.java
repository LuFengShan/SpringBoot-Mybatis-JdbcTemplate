package com.gx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.gx.entity.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public Department findById(Integer id) {
    String sql = "select id, departmentName from department where id = ?";
    Department department =
        jdbcTemplate.queryForObject(sql, new Object[] {id}, new RowMapper<Department>() {
          public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
            Department department = new Department();
            department.setId(rs.getInt("id"));
            department.setDepartmentName(rs.getString("departmentName"));
            return department;
          }
        });
    return department;
  }
}

