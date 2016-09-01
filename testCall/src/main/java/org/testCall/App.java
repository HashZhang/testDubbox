package org.testCall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testClient.Camera;
import org.testClient.CameraService;
import org.testClient.DemoObject;
import org.testClient.DemoService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext(
             "classpath:META-INF/spring/spring-sfpp-web-dubbo.xml");
        DemoService demoService = act.getBean(DemoService.class);
        System.out.println(demoService.printMessage(new DemoObject().setMessage("asd").setName("asd").setSalary(0.0)));

		ApplicationContext act1 = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/spring-sfpp-web-dubbo.xml");
		CameraService cameraService = act1.getBean(CameraService.class);
		System.out.println(cameraService.printMessage(new Camera().setBrand("NIKON").setModel("D7200").setPrice(8000.00)));
	}
}
