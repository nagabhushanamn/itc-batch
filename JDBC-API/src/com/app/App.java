package com.app;

import java.util.List;

import com.app.dao.EmployeeDAO;
import com.app.model.Employee;

public class App {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();

		// --------------------------------------------
		// Insert

		// Employee employee = new Employee();
		// employee.setId(2);
		// employee.setName("Ria");
		// employee.setSalary(100.00);
		//
		// employeeDAO.save(employee);
		// System.out.println("Emp Saved...");

		// --------------------------------------------

		// Select all employees

		List<Employee> employees = employeeDAO.findAll();
		for (Employee e : employees) {
			System.out.println(e);
		}

		// --------------------------------------------

		// select one employee by id

		// Employee employee = employeeDAO.find(1);
		// System.out.println(employee);

		// ---------------------------------------------

		// select one employees based on salary

		// List<Employee> employees = employeeDAO.findBySalary(1000.00);
		// for (Employee e : employees) {
		// System.out.println(e);
		// }

		// ---------------------------------------------

		// update employee

		// employeeDAO.update(1, 2000.00);

		// ---------------------------------------------

		// employeeDAO.delete(1);

	}

}
