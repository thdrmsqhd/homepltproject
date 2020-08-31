package com.spring.plt.manuFac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plt.manuFac.dao.ManuFacDAO;

@Service
public class ManuFacServiceImpl implements ManuFacService{

	@Autowired
	ManuFacDAO dao;
	
	@Override
	public void serchByLoc() {
		System.out.println("ManuFac service");
		dao.serchByLoc();
	}
	
}
