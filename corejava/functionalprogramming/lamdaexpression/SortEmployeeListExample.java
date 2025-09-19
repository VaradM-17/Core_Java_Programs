package com.corejava.functionalprogramming.lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nid=" + id + ",name=" + name + ",age=" + age + ",salary=" + salary + "\n";
	}
}

public class SortEmployeeListExample {
	public static void main(String[] args) {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee(1, "Varad", 20, 20000));
		listOfEmployees.add(new Employee(2, "Abhay", 50, 50000));
		listOfEmployees.add(new Employee(3, "Amita", 27, 40000));

//		Comparator<Employee> sortByAsc = (o1, o2) -> o1.getSalary() - o2.getSalary();
		Collections.sort(listOfEmployees, (o1, o2) -> o1.getSalary() - o2.getSalary());
		System.out.print(listOfEmployees);

//		Comparator<Employee> sortByDsc = (o1, o2) -> o2.getSalary() - o1.getSalary();
		Collections.sort(listOfEmployees, (o1, o2) -> o2.getSalary() - o1.getSalary());
		System.out.println(listOfEmployees);

	}
}

//class SortEmployeeByAscending implements Comparator<Employee> {
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o1.getSalary() - o2.getSalary();
//	}
//}
//
//class SortEmployeeByDescending implements Comparator<Employee> {
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o2.getSalary() - o1.getSalary();
//	}
//}
