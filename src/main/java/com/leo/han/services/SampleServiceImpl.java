package com.leo.han.services;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.leo.han.beans.User;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Autowired
	JmsTemplate jmsTemplate;
	
	@Override
	public void sendAlert(final User user) {

		//Step4: configure the send message part in the service implementation
		
		jmsTemplate.send(new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				return session.createObjectMessage((Serializable) user);
			}
		});
	}
}
