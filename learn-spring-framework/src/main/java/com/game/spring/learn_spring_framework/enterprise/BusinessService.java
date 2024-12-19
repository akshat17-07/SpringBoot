package com.game.spring.learn_spring_framework.enterprise;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BusinessService{
	
	@Autowired
	private DataService dataServices;
	
	public long calculateSum() {
		List<Integer> data = dataServices.getData();
		return data.stream().reduce(Integer::sum).get();
	}

}
