/**
 * ProjectName:springboot20180611<BR>
 * File name: DepartmentController.java <BR>
 * Author: SGX <BR>
 * Project:springboot20180611 <BR>
 * Version: v 1.0 <BR>
 * Date: 2018年6月11日 下午2:52:44 <BR>
 * Description: <BR>
 * Function List: <BR>
 */

package com.gx.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gx.entity.Department;
import com.gx.service.DepartmentService;

@RestController
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @RequestMapping("/dpt/{id}")
  public Department findById(@PathVariable Integer id) {
    return departmentService.findById(id);
  }


  @RequestMapping("/dpt")
  public List<Department> listDepartment() {
    return departmentService.listDepartment();
  }

  @RequestMapping("/dpt/insert/{departmentName}")
  public void insertDepartment(@PathVariable String departmentName) {
    departmentService.insertDepartment(departmentName);
  }

}

