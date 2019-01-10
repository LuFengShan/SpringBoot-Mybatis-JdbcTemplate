package com.gx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.gx.entity.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Department findById(Integer id) {
		String sql = "select id, departmentName from department where id = ?";
		Department department =
				jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
					Department department1 = new Department();
					department1.setId(rs.getInt("id"));
					department1.setDepartmentName(rs.getString("departmentName"));
					return department1;
				});
		return department;
	}
}

