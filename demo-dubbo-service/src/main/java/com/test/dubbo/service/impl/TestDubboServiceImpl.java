package com.test.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.test.dubbo.service.TestDubboService;
/**
 * @ClassName: TestDubboServiceImpl
 * @Description: 服务端，实现 API jar包中的接口
 * @author qinf QQ:908247035
 * @date 2017年1月3日
 * @version V1.0
 */
@Service("testDubboService")
public class TestDubboServiceImpl implements TestDubboService{
	public String getDubboTest() {
		return "Test Dubbo OK OK!";
	}
}
