package com.cetpa.orm;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@PrimaryKeyJoinColumn(name = "teacher_id")
@Table(name = "fulltime")
@Entity
public class FulltimeTeacher extends Teacher
{
	private float monthly_salary;

	public float getMonthly_salary() {
		return monthly_salary;
	}

	public FulltimeTeacher
	(int id, String name, String topic, float monthly_salary) {
		super(id, name, topic);
		this.monthly_salary = monthly_salary;
	}

	public void setMonthly_salary(float monthly_salary) {
		this.monthly_salary = monthly_salary;
	}

	public FulltimeTeacher() {
	}

}

