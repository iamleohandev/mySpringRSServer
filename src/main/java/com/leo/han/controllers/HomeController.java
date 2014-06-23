package com.leo.han.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.leo.han.services.SampleService;


@Controller
public class HomeController {
	
	@Autowired
	private SampleService sampleService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String goHomeGET(){

		return "home";
	}
}
