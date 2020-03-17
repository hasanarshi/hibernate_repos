package com.cetpa.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Teacher.class)
		.addAnnotatedClass(FulltimeTeacher.class)
		.addAnnotatedClass(ParttimeTeacher.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		FulltimeTeacher ft = new FulltimeTeacher
				(1, "Shivam", "How to do chichorapan in public", 
						12000);
		
		ParttimeTeacher pt = new ParttimeTeacher
				(2, "Akhilesh", "Khait mai shoch kaise karen", 
						4, 500);
		
		Transaction tx = session.beginTransaction();
		
		session.persist(ft);
		session.persist(pt);;
		
		tx.commit();
		
		factory.close();
		
		System.out.println("Ok");
		
	}
}
