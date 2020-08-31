package com.spring.plt.expert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.plt.expert.dao.ExpertDAO;

@Service
public class ExpertServiceImpl implements ExpertService{
	
	@Autowired
	ExpertDAO dao;
	
	@Override
	public void serchByExpertName() {
		System.out.println("expert Service");
		dao.serchByExpertName();
	}
}
