package com.gupaoedu.demo.service.impl;

import com.gupaoedu.demo.service.IDemoService;
import com.gupaoedu.mvcframework.v3.annotation.GPService;

/**
 * @program: spring_core_300
 * @description: test interface impl
 * @Author: heliang.wang
 * @Date: 2020/2/11 3:50 下午
 * @Version: 1.0
 */

@GPService
public class DemoServiceImpl implements IDemoService {
	@Override
	public String getName(String name) {
		return name;
	}
}
