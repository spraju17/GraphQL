package com.spraju.graphql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plans")
public class Plan {
	@Id
	@Column(name = "plan_id")
	private Long planID;
	public Long getPlanID() {
		return planID;
	}
	public void setPlanID(Long planID) {
		this.planID = planID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "name")
	private String name;
}
