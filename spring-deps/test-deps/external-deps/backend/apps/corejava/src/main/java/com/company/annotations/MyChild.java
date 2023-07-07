package com.company.annotations;

public class MyChild extends MyParent {

	@Override
	public String greet(String name) {
		return "Hi " + name;
	}
}
