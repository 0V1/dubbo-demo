package com.test.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.test.dubbo.service.TestDubboService;

@Service("testDubboService")
public class TestDubboServiceImpl implements TestDubboService{
	public String getDubboTest() {
		return "Test Dubbo OK OK!";
	}
}
