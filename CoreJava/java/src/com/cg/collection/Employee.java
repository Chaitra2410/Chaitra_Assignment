package com.cg.collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private int salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	static void allDetails(  TreeSet<Employee> emp) {
	for (Employee employee : emp) {
		System.out.println(employee);
	}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a or b");
		String s= sc.next();
		if(s.equals("a")) {
       TreeSet<Employee> emp = new TreeSet<Employee>(new aComparator());
       emp.add(new Employee(1, "Chai","Civ" , 12000));
       emp.add(new Employee(2, "Chotu","Civ" , 12000));
       emp.add(new Employee(3, "Sanvi","Civ" , 12000));
       emp.add(new Employee(4, "Jaanu","Civ" , 12000));
       emp.add(new Employee(5, "Adya","Civ" , 12000));
       allDetails(emp);
	}
       
		else if(s.equals("b")) {
		       TreeSet<Employee> emp = new TreeSet<Employee>(new bComparator());
		       emp.add(new Employee(1, "Chai","Civ" , 12000));
		       emp.add(new Employee(2, "Chotu","Civ" , 12000));
		       emp.add(new Employee(3, "Sanvi","Civ" , 12000));
		       emp.add(new Employee(4, "Jaanu","Civ" , 12000));
		       emp.add(new Employee(5, "Adya","Civ" , 12000));
		       allDetails(emp);
			}
		else
		{
			System.out.println("Enter a or b");
			
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
class aComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()==o2.getId())
		{
		return 0;}
		else if(o1.getId()>o2.getId()){
			return 1;
		}
		else { return -1;}
	}
	
}
class bComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

