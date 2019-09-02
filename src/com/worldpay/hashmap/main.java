package com.worldpay.hashmap;

import java.util.HashMap;

public class main {

	public static void main(String[] args) {

		HashMap<Employee, Project> hamp = new HashMap<>();

		Employee e1 = new Employee(1001, "Ashi", 20000, "Team Leader");
		Employee e2 = new Employee(1002, "Sadiya", 24000, "Project manager");
		Employee e3 = new Employee(1003, "Anjali", 30000, "manager");
		Employee e4 = new Employee(1004, "Pooja", 50000, "CEO");
		Employee e5 = new Employee(1002, "Sadiya", 24000, "Project manager");
		Project p = new Project(501, "WasteManagemant", 5, "john");
		Project p1 = new Project(502, "insurancesystem", 3, "kanny");
		Project p2 = new Project(503, "librarysystem", 7, "kelly");
		Project p3 = new Project(504, "hostelsystem", 6, "jack");
		Project p5 = new Project(505, "doctor app", 5, "james");
		hamp.put(e1, p);
		hamp.put(e2, p1);
		hamp.put(e3, p2);
		hamp.put(e4, p3);
		hamp.put(e5, p5);
		
		System.out.println(hamp);

	}

}
