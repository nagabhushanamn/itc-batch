package com.itc.vendor;

import com.itc.emp.Employee;

public class MatchPoint {

	public static void manageEmployees() {

		// create employee objs
		Employee e1 = new Employee();
		e1.num = 1;
		e1.name = "A";

		Employee e2 = new Employee();
		e2.num = 2;
		e2.name = "B";

		// do tng...
		
		Employee.tnrName="Nag";
		Employee.doTrain();

		// do learn
		
		e1.doLearn();
		e2.doLearn();

	}

}
