package org.testServer;

import org.springframework.stereotype.Service;
import org.testClient.DemoObject;
import org.testClient.YangService;

@Service
public class YangServiceImpl implements YangService {
	public String addSalary(DemoObject demoObject){
		double salary = demoObject.getSalary();
		return(demoObject.setName("yang").setMessage("获得salary双倍奖励").setSalary(salary*2).toString());
	}
}
