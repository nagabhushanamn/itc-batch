package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Update_Ex {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();

		// -----------------------------------

		Employee employee = session.get(Employee.class, 123);
		employee.setSalary(20000.00);
		
		session.update(employee);

		// -----------------------------------

		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
