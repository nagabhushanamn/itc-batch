package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.model.Employee;

public class EmployeeDAO {

	private SessionFactory sessionFactory;

	public EmployeeDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee employee) {
		Session session = sessionFactory.openSession();
		session.getTransaction().commit();
		session.save(employee);
		session.close();
	}

	public Employee find(int id) {
		Session session = sessionFactory.openSession();
		session.getTransaction().commit();
		Employee employee = session.get(Employee.class, id);
		session.close();
		return employee;
	}

	public List<Employee> findAll() {
		Session session = sessionFactory.openSession();
		session.getTransaction().commit();
		List<Employee> employees = session.createQuery("from Employee").list();
		session.close();
		return employees;
	}

	public void update(Employee employee) {
		Session session = sessionFactory.openSession();
		session.getTransaction().commit();
		session.merge(employee);
		session.close();
	}

	public void delete(int id) {
		Session session = sessionFactory.openSession();
		session.getTransaction().commit();
		session.delete(session.load(Employee.class, id));
		session.close();
	}

}
