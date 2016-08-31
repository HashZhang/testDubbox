package org.testClient;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String sex;
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public User setAge(int age) {
		this.age = age;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public User setSex(String sex) {
		this.sex = sex;
		return this;
	}
	
	
	
}
