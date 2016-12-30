package provider.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderStart {
    public static void main(String[] args) throws Exception {
//    	com.alibaba.dubbo.container.Main.main(args);
    	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                 new String[] { "config/spring-mybatis.xml","config/spring.xml","config/spring-ehcache.xml" });  
         context.start();  
   
         System.in.read(); // 按任意键退出 
    }
} 
