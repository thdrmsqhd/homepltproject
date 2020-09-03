package com.spring.plt.manuFac.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.manuFac.service.ManuFacService;
import com.spring.plt.manuFac.vo.ManuFacVO;

@Controller
public class ManuFacConrollerImpl implements ManuFacController{
	
	@Autowired
	ManuFacService service;
	
	@Autowired
	ManuFacVO manuFacVO;
	
	@RequestMapping(value="/allManuFac")
	@Override
	public ModelAndView allManuFac(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("ManuFac Controller allManuFac");
		String viewName = (String) request.getAttribute("viewName");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.allManuFac();
		ModelAndView mav = new ModelAndView(viewName);//�� �����Ұ� 
		mav.addObject("manuFacList",manuFacList);
		return mav;
	}
	
	
	@RequestMapping(value="/serchByManuLoc", method = RequestMethod.GET)
	@Override//��ġ��� �˻�
	public ModelAndView serchByLoc(@RequestParam("loc") String loc,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(loc);
		System.out.println("ManuFac controller");
		String viewName = (String) request.getAttribute("viewName");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuLoc(loc);
		ModelAndView mav = new ModelAndView(viewName);//�� �����Ұ� 
		mav.addObject("manuFacList",manuFacList);
		return mav;
	}
	
	@SuppressWarnings("null")
	@RequestMapping(value="/serchByManuType", method = RequestMethod.GET)
	@Override//������� �˻�
	@ResponseBody
	public Map<Integer, Map<String, Object>> serchByManuType(@RequestParam("manuType") String manuType,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(manuType);
		System.out.println("ManuFac controller");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuType(manuType);
		Map<Integer, Map<String, Object>> map = new HashMap<Integer, Map<String,Object>>();
		for(int i =0; i<manuFacList.size(); i++) {
			Map<String,Object> manuFac = new HashMap<String,Object>();
			String id = manuFacList.get(i).getId();
			manuFac.put("id", id);
			String pwd = manuFacList.get(i).getPwd();
			manuFac.put("pwd", pwd);
			String name = manuFacList.get(i).getManuName();
			manuFac.put("name", name);
			String ceoName = manuFacList.get(i).getManuCeoName();
			manuFac.put("ceoName", ceoName);
			String email = manuFacList.get(i).getManuEmail();
			manuFac.put("email", email);
			String bizNo = manuFacList.get(i).getManuBizNo();
			manuFac.put("bizNo",bizNo);
			String type = manuFacList.get(i).getManuBizType();
			manuFac.put("type",type);
			String addr = manuFacList.get(i).getManuAddr();
			manuFac.put("addr",addr);
			String locY = manuFacList.get(i).getManuFacLocX();
			manuFac.put("locY",locY);
			String locX = manuFacList.get(i).getManuFacLocX();
			manuFac.put("locX",locX);
			String tel = manuFacList.get(i).getManuTel();
			manuFac.put("tel",tel);
			String start = manuFacList.get(i).getManuStart();
			manuFac.put("start",start);
			String detail = manuFacList.get(i).getManuDetail();
			manuFac.put("detail",detail);
			String img = manuFacList.get(i).getManuImg();
			manuFac.put("img",img);
			int price = manuFacList.get(i).getProductPrice();
			manuFac.put("price",price);
			String auth = manuFacList.get(i).getManuAuth();
			manuFac.put("auth",auth);
			map.put(i,manuFac);
		}
		System.out.println(map);
		return map;//������ ��Ÿ������ �õ� �غ���,ajax�� ���� ������ �ִ°��� json,xml,text...�̱⶧���� json���� ��ȯ���ִ°��� �´�
	}
	
	@RequestMapping(value="/serchByPrice", method = RequestMethod.GET)
	@Override//�ּ��ֹ��ݾ� ��� �˻�
	public ModelAndView serchByManuMinimumPrice(@RequestParam("price") String price,HttpServletRequest request, HttpServletResponse response) {
		System.out.println(price);
		System.out.println("ManuFac controller");
		String viewName = (String) request.getAttribute("viewName");
		List<ManuFacVO> manuFacList= new ArrayList<ManuFacVO>();
		manuFacList = service.serchByManuMinimumPrice(price);
		ModelAndView mav = new ModelAndView(viewName);//�� �����Ұ� 
		mav.addObject("manuFacList",manuFacList);
		return mav;
	}
	
	@RequestMapping(value="/viewManuFac", method= RequestMethod.GET)
	@Override//�� ���
	public ModelAndView viewManuFac(@RequestParam("id") String id, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(id);
		System.out.println("ManuFac View");
		String viewName = (String) request.getAttribute("viewName");
		manuFacVO = service.viewManuFac(id);
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("manuFacVO", manuFacVO);
		System.out.println(manuFacVO);
		return mav;
	}
	
	
	@RequestMapping(value="/test")
	public void test() {
		System.out.println("test");
	}
}
