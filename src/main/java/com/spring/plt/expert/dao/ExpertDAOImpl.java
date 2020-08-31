package com.spring.plt.expert.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ExpertDAOImpl implements ExpertDAO {
	
	@Override
	public void serchByExpertName() {
		System.out.println("expert DAO");
	}
}
