package org.testCall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testClient.DemoObject;
import org.testClient.YangService;

/**
 * Hello world!
 *
 */
public class TestYangService {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/spring-sfpp-web-dubbo.xml");
		YangService yangService = act.getBean(YangService.class);
		System.out.println(yangService.addSalary(new DemoObject().setMessage("msg").setName("name").setSalary(10)));
	}
}
