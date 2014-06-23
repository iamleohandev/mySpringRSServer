package com.leo.han.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;


@Service("sampleService")
public class SampleServiceImpl implements SampleService {


	//Step3: configure the service for the RPC
	@Override
	public String getServiceMessage(String first, String second) {
		// TODO Auto-generated method stub
		
		String result = first + "  AND  " + second;
		return result;
	}
	
	
}
