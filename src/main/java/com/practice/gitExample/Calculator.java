package com.practice.gitExample;

public class Calculator {

	public long add(long first, long second) {
		return Math.addExact(first, second);
	}

	public long subtract(long first, long second) {
		return first - second;
	}

	public long multiply(long first, long second) {
		return first * second;
	}

	public long divide(long first, long second) {
		return first / second;
	}
	
	public String getEmployeeData() {
		
		//Connect to DB
		//Queries to DB
		//convert to JSON
		return "";
	}
}
