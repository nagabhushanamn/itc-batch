package com;

import java.util.Map;
import java.util.TreeMap;

public class Ques {

	public static void main(String[] args) {

		String[] records = { 
							 "NAME,DEP1,3000", 
				             "NAME,DEP2,4000", 
				             "NAME,DEP2,5000", 
				             "NAME,DEP1,6000",
				             "NAME,DEP3,6000" };

		Map<String, Double> report = new TreeMap<>();

		for (String record : records) {
			
			String[] tokens = record.split(",");

			String dep = tokens[1];
			double salary = Double.parseDouble(tokens[2]);

			if (!report.containsKey(dep)) {
				report.put(dep, salary);
			} else {
				salary = report.get(dep) + salary;
				report.put(dep, salary);
			}

		}
		
		System.out.println(report);

	}

}
