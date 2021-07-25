package com.spraju.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spraju.graphql.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

}
