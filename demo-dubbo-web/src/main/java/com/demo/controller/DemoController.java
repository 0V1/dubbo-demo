package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dubbo.service.TestDubboService;

@Controller
@RequestMapping ("/mydubbo")
public class DemoController {

	@Autowired
	private TestDubboService testDubboService;

	@RequestMapping ("test01")
	@ResponseBody
	public String test01(HttpServletRequest request,HttpServletResponse response){	
		System.err.println("����dubbo����ʼ...");
		String str = testDubboService.getDubboTest();
		System.out.println("����dubbo���Ϊ��"+str);
		System.out.println("����dubbo���������");
		return str;
	}
}
