package com.spring.plt.expert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.plt.expert.service.ExpertService;

@Controller
public class ExpertControllerImpl implements ExpertController {

	@Autowired
	ExpertService service;
	
	@RequestMapping(value="/serchByExpertName")
	@Override
	public void serchByExpertName() {
		System.out.println("expert Controller");
		service.serchByExpertName();
	}
	

	
}
