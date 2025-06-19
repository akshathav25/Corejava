package com.ait.day5.Inheritance;

public class HierarchialDemo {

	public static void main(String[] args) {
		Person p;
		p=new Student1("Diya","Bangalore","6th sem",97.5f);
		System.out.println(p);
		p=new Employee("ISE","Bangalore",020,20000,"Diya");
		System.out.println(p);

	}

}
