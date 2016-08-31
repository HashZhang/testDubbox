package org.testCall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testClient.TestService;
import org.testClient.User;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/spring-sfpp-web-dubbo.xml");
	//	DemoService demoService = act.getBean(DemoService.class);
		TestService ts = act.getBean(TestService.class);
		User u = new User();
		u.setName("小明").setAge(20).setSex("男");
		System.out.println(ts.getInfo(u));
	}
}
