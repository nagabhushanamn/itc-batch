package com.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Select_Ex2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		session.getTransaction().begin();

		// -----------------------------------

		// HQL
		String salary = "2000.00";
		Query<Employee> query = session.createQuery("from Employee where salary > ?");
		 query.setDouble(0, Double.parseDouble(salary));
		List<Employee> employees = query.list();

		for (Employee e : employees) {
			System.out.println(e);
		}

		// -----------------------------------

		session.getTransaction().commit();

		session.close();
		factory.close();

	}

}
