package com.cetpa.orm;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name="teacher")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Teacher 
{
	private int id;
	private String name, topic;

	@Id
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTopic() {
		return topic;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Teacher() {
	}

	public Teacher(int id, String name, String topic) {
		super();
		this.id = id;
		this.name = name;
		this.topic = topic;
	}
}