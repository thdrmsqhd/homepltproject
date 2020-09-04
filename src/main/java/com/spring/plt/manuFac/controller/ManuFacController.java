package com.spring.plt.manuFac.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.spring.plt.manuFac.vo.ManuFacVO;

public interface ManuFacController {

	Map<Integer, Map<String, Object>> serchByLoc(String loc, HttpServletRequest request, HttpServletResponse response);

	Map serchByManuType(String manuType, HttpServletRequest request, HttpServletResponse response);

	Map<Integer, Map<String, Object>> serchByManuMinimumPrice(String price, HttpServletRequest request, HttpServletResponse response);

	ModelAndView viewManuFac(String id, HttpServletRequest request, HttpServletResponse response);

	ModelAndView allManuFac(HttpServletRequest request, HttpServletResponse response);

}
