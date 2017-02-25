package com;

import com.emp.NonTechEmployee;
import com.emp.TechEmployee;

public class App {

	public static void main(String[] args) {

		// TechEmployee te=new TechEmployee();
		// te.id=123;
		// te.name="Nag";
		// te.salary=100.00;
		// te.techSkill="Java";

		// ---------------------------------------

		TechEmployee techEmployee = new TechEmployee(123);
		NonTechEmployee nonTechEmployee=new NonTechEmployee(124);

		// -----------------------------------------

		// techEmployee.id=0; // Not possible to access directly

		System.out.println(techEmployee.getId());
		
	}

}
