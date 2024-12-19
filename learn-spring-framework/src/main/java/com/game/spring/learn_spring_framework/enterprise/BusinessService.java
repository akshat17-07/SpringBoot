package com.game.spring.learn_spring_framework.enterprise;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.game.spring.learn_spring_framework.enterprise.data.DataService;


@Component
public class BusinessService{
	
	
	private DataService dataServices;
	
	@Autowired
	public BusinessService(DataService dataServices) {
		super();
		this.dataServices = dataServices;
	}



	public long calculateSum() {
		List<Integer> data = dataServices.getData();
		return data.stream().reduce(Integer::sum).get();
	}

}
