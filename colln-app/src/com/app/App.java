package com.app;

import java.util.List;

import com.app.model.Employee;
import com.app.service.EmployeeService;

public class App {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();

		// Add new Employee

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Nag");
		employee1.setSalary(100.00);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Ria");
		employee2.setSalary(200.00);

		service.addNewEmployee(employee1);
		service.addNewEmployee(employee2);

		// ----------------------------------------

		// List all employees

		// List<Employee> employees=service.findAll();
		// for(Employee e:employees){
		// System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary());
		// }

		// --------------------------------------------

		// find one employee

		// Employee e = service.findEmployee(1);
		// System.out.println(e.getId() + "\t" + e.getName() + "\t" +
		// e.getSalary());

		// --------------------------------------------

		// update employee

		// service.updateEmployee(1, 500.00);
		// Employee e = service.findEmployee(1);
		// System.out.println(e.getId() + "\t" + e.getName() + "\t" +
		// e.getSalary());

		// --------------------------------------------

		service.deleteEmployee(1);
		List<Employee> employees = service.findAll();
		for (Employee e : employees) {
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSalary());
		}

	}

}
