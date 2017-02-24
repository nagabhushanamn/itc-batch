package com.app.service;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Employee;

public class EmployeeService {

	private List<Employee> employees = new ArrayList<>();

	public void addNewEmployee(Employee employee) {
		// ..
		employees.add(employee);
	}

	public List<Employee> findAll() {
		return employees;
	}

	public Employee findEmployee(int id) {
		Employee employee = null;
		for (Employee e : employees) {
			if (e.getId() == id) {
				employee = e;
				break;
			}
		}
		return employee;
	}

	public void updateEmployee(int id, double salary) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				e.setSalary(salary);
				break;
			}
		}
	}

	public void deleteEmployee(int id) {
		for (Employee e : employees) {
			if (e.getId() == id) {
				employees.remove(e);
			}
		}
	}

}
