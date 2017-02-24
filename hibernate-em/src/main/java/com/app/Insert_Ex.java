package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Insert_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(126);
		employee.setName("Indu");
		employee.setSalary(1000.00);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();

		session.save(employee);

		session.getTransaction().commit();
		System.out.println("New Employee saved into DB");

		session.close();
		factory.close();

	}

}
