package org.testServer;

import org.springframework.stereotype.Service;
import org.testClient.TestService;
import org.testClient.User;
@Service
public class TestServiceImpl implements TestService {
	public String getInfo(User user) {
		String s = "我叫"+user.getName()+","+user.getAge()+"岁，是"+user.getSex()+"生。";
		System.out.println(s);
		return s;
	}

}
