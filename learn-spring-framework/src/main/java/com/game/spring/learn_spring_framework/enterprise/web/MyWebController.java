package com.game.spring.learn_spring_framework.enterprise.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.game.spring.learn_spring_framework.enterprise.BusinessService;

@Component
public class MyWebController {
	
	
	private BusinessService businessService;
	

	@Autowired
	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}



	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}

