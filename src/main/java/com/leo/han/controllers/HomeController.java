package com.leo.han.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leo.han.beans.User;
import com.leo.han.services.SampleService;


@Controller
public class HomeController {
	
	@Autowired
	private SampleService sampleService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String goHomeGET(Model model){
		
		model.addAttribute("user", new User());
		
		return "home";
	}
	
	@RequestMapping(value="/jmsCompleted", method = RequestMethod.POST)
	public String goHomePOST(User user){
		
		sampleService.sendAlert(user);
		
		return "jmsCompleted";
	}
}
