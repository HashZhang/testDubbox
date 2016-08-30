package org.testServer;

import org.springframework.stereotype.Service;
import org.testClient.DemoObject;
import org.testClient.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	public String printMessage(DemoObject demoObject) {
		System.out.println(demoObject.toString());
		return demoObject.toString();
	}
}
