package com.leo.han.services;

import org.springframework.stereotype.Service;

@Service("calculateService")
public class CalculateServiceImpl implements CalculateService {

	public String getSummary() {
		// TODO Auto-generated method stub
		return "This is a remote service test method";
	}

	public int sum(int a, int b) {
		
		return a+b;
	}

}
