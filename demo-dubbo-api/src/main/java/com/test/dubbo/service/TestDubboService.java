package com.test.dubbo.service;
/**
 * @ClassName: TestDubboService
 * @Description: 一般单独有一个jar包，维护服务接口定义、
 * RPC参数类型、RPC返回类型、接口异常、接口用到的常量，该jar包中不处理任何业务逻辑。
 *
 * @author qinf QQ:908247035
 * @date 2017年1月3日
 * @version V1.0
 */
public interface TestDubboService {
	
	public String getDubboTest();
}
