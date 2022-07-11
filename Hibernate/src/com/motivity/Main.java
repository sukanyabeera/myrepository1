package com.motivity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cf=new Configuration();
		cf.configure("hibernate.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student manu=new Student();
		
	/*	manu.setId(2063);
		manu.setName("mahi");
		manu.setMarks(455);
		se.saveOrUpdate(manu);
		
		manu.setId(2064);
		manu.setName("mahesh");
		manu.setMarks(451);
		se.delete(manu);
		*/
		manu.setId(2067);
		manu.setName("Divya");
		manu.setMarks(444);
		se.save(manu);
		tx.commit();
		se.close();

	}

}

