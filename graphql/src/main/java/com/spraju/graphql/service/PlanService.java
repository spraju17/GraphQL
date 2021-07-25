package com.spraju.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spraju.graphql.entity.Plan;
import com.spraju.graphql.repository.PlanRepository;

@Service
public class PlanService {
	@Autowired
	PlanRepository planRepository;
	
	public List<Plan> getPlans(){
		return planRepository.findAll();
	}
}
