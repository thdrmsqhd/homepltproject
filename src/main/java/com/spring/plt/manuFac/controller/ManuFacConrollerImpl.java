package com.spring.plt.manuFac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.manuFac.service.ManuFacService;
import com.spring.plt.manuFac.vo.ManuFacVO;

@Controller
public class ManuFacConrollerImpl implements ManuFacController{
	
	@Autowired
	ManuFacService service;
	
	@RequestMapping(value="/serchByLoc")
	public void serchByLoc() {
		System.out.println("ManuFac controller");
		service.serchByLoc();
	}
}
