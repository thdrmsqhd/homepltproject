package com.spring.plt.expert.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface ExpertController {

	ModelAndView serchByExpertType(String type, HttpServletRequest request, HttpServletResponse response);

	ModelAndView serchByExpertName(String name, HttpServletRequest request, HttpServletResponse response);

	ModelAndView viewExpert(String id, HttpServletRequest request, HttpServletResponse response);

	ModelAndView allExpert(HttpServletRequest request, HttpServletResponse response);

}
