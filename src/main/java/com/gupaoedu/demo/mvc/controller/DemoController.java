package com.gupaoedu.demo.mvc.controller;

import com.gupaoedu.demo.service.IDemoService;
import com.gupaoedu.mvcframework.v3.annotation.GPAutowired;
import com.gupaoedu.mvcframework.v3.annotation.GPController;
import com.gupaoedu.mvcframework.v3.annotation.GPRequestMapping;
import com.gupaoedu.mvcframework.v3.annotation.GPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: spring_core_300
 * @description: demo controller
 * @Author: heliang.wang
 * @Date: 2020/2/11 3:50 下午
 * @Version: 1.0
 */
@GPController
@GPRequestMapping("/gpedu")
public class DemoController {

	@GPAutowired
	IDemoService demoService;

	@GPRequestMapping("/query")
	public void query(HttpServletRequest request, HttpServletResponse response, @GPRequestParam("name") String name) throws Exception {
		String result = demoService.getName(name);
		try {
			response.getWriter().write("my name is : " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
