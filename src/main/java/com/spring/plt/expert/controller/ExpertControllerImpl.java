package com.spring.plt.expert.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.expert.service.ExpertService;
import com.spring.plt.expert.vo.ExpertVO;

@Controller
public class ExpertControllerImpl implements ExpertController {

	@Autowired
	ExpertService service;
	
	@Autowired
	ExpertVO expertVO;
	
	@RequestMapping(value="/allExpert")
	@Override//전체 출력
	public ModelAndView allExpert(HttpServletRequest request, HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println(viewName);
		System.out.println("expert Controller allExpert");
		List<ExpertVO> expertList = new ArrayList<ExpertVO>();
		expertList = service.allExpert();
//		System.out.println(expertList);
		ModelAndView mav = new ModelAndView(viewName);//뷰 설정할것
		mav.addObject("expertList", expertList);
		System.out.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping(value="/serchByExpertName",method = RequestMethod.GET)
	@Override//이름검색
	public ModelAndView serchByExpertName(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println("expert Controller serchByExpertName");
		List<ExpertVO> expertList = new ArrayList<ExpertVO>();
		expertList = service.serchByExpertName(name);
		System.out.println(expertList);
		ModelAndView mav = new ModelAndView(viewName);//뷰 설정할것
		mav.addObject("expertList", expertList);
		return mav;
	}
	
	@RequestMapping(value="/serchByExpertType", method = RequestMethod.GET)
	@Override//분야검색
	public ModelAndView serchByExpertType(@RequestParam("type") String type, HttpServletRequest request, HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println("expert Controller serchByExpertType");
		List<ExpertVO> expertList = new ArrayList<ExpertVO>();
		expertList = service.serchByExpertType(type);
		System.out.println(expertList);
		ModelAndView mav = new ModelAndView(viewName);//뷰 설정 할 것
		mav.addObject("expertList", expertList);
		return mav;
	}
	
	
	@RequestMapping(value="/viewExpert", method = RequestMethod.GET)
	@Override//뷰
	public ModelAndView viewExpert(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) {
		String viewName = (String) request.getAttribute("viewName");
		System.out.println("expert Controller serchByExpertType");
		expertVO = service.viewExpert(id);
		System.out.println(expertVO);
		ModelAndView mav = new ModelAndView(viewName);//뷰 설정 할 것
		mav.addObject("expertVO", expertVO);
		System.out.println(mav);
		return mav;
	}
	
	
	//뷰인터셉터 설정, 뷰 작성 필요 09/01
	//경력별로 검색 가능하게 분야 + 경력
	

	
}
