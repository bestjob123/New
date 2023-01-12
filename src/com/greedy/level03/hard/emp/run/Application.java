package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		EmployeeDTO employee = new EmployeeDTO();
		int a = sc.nextInt();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String d = sc.nextLine();
		int e = sc.nextInt();
		char f = sc.nextLine().charAt(0);
		int g = sc.nextInt();
		double h = sc.nextDouble();
		String i = sc.nextLine();
		String j = sc.nextLine();
		
		employee.setNumber(a);
		employee.setName(b);
		employee.setDept(c);
		employee.setJob(d);
		employee.setAge(e);
		employee.setGender(f);
		employee.setSalary(g);
		employee.setBonusPoint(h);
		employee.setPhone(i);
		employee.setAddress(j);
		
		System.out.println(employee.getNumber());
		
		
	}

}
