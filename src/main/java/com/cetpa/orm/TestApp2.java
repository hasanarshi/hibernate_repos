package com.cetpa.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Teacher.class)
		.addAnnotatedClass(FulltimeTeacher.class)
		.addAnnotatedClass(ParttimeTeacher.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		session.get(Teacher.class, 1);
		
		
		factory.close();
	}
}
