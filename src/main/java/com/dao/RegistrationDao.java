 package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RegistrationDao {

	public Session registDao() {
		SessionFactory factory=new Configuration().configure("hibernate-cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
	
		return session;
		
	}
	
	
}
