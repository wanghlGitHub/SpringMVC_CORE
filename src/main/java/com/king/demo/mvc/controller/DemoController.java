package com.king.demo.mvc.controller;

import com.king.demo.service.IDemoService;
import com.king.mvcframework.annotation.GPAutowired;
import com.king.mvcframework.annotation.GPController;
import com.king.mvcframework.annotation.GPRequestMapping;
import com.king.mvcframework.annotation.GPRequestParam;

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
