package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transection = session.beginTransaction();
		
		Student st = (Student)session.get(Student.class, 2);
		st.setFisrtname("shubham");
		st.setLastname("shrikhande");
		st.setCity("pune");
		st.setPhoneNumber("6789098765");
		session.update(st);
		
		transection.commit();
		session.close();
		System.out.println("record Update ");
	}

}
