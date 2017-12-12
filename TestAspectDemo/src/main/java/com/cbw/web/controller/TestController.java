/**
 * 
 */
package com.cbw.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
* @Title: TestController.java 
* @Package com.cbw 
* @Description: TODO(用一句话描述该文件做什么) 
* @author cbw   
* @date 2017年12月12日 下午2:27:32 
* @version V1.0   
*/
@RestController
@RequestMapping("/test")
public class TestController {
	
	
	@RequestMapping("/hello")
	public Object test01() {
		
		
		return "";
	}

}
