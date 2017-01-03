package provider.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @ClassName: DubboProviderStart
 * @Description: 用main的方式直接启动服务端
 * @author qinf QQ:908247035
 * @date 2017年1月3日
 * @version V1.0
 */
public class DubboProviderStart {
    @SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
//    	com.alibaba.dubbo.container.Main.main(args);
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                 new String[] { "config/spring-mybatis.xml","config/spring.xml","config/spring-ehcache.xml" });  
         context.start();  
   
         System.in.read(); // 按任意键退出 
    }
} 
