/** 
 * ProjectName:springboot20180611<BR>
 * File name: IndexController.java <BR>
 * Author: SGX <BR>
 * Project:springboot20180611 <BR>
 * Version: v 1.0 <BR>
 * Date: 2018年6月11日 上午9:30:04 <BR>
 * Description: <BR>
 * Function List: <BR>
 */

package com.gx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
  
  @RequestMapping
  public String index() {
    return "你好";
  }

}

	