package com.cetpa.orm;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "teacher_id")
@Table(name = "parttime")
@Entity
public class ParttimeTeacher extends Teacher 
{
	private int visits, cost_per_visit;

	public int getVisits() {
		return visits;
	}

	public int getCost_per_visit() {
		return cost_per_visit;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public void setCost_per_visit(int cost_per_visit) {
		this.cost_per_visit = cost_per_visit;
	}

	public ParttimeTeacher() {
	}

	public ParttimeTeacher
	(int id, String name, String topic, int visits, int cost_per_visit) {
		super(id, name, topic);
		this.visits = visits;
		this.cost_per_visit = cost_per_visit;
	}
}
