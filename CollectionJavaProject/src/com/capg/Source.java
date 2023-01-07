package com.capg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class SortByName implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
public class Source {

	public static void main(String[] args) {
		
	Set<Employee> tsemp=new TreeSet<Employee>();
	Employee emp1=new Employee(102, "Poojitha", 25000, 22, "Developer");
	tsemp.add(emp1);
	tsemp.add(new Employee(103, "Pravallika", 24000, 21, "Jr Developer"));
	tsemp.add(new Employee(101, "Teju", 23000, 21, "Team Leader"));
	tsemp.add(new Employee(104, "Nikki", 22500, 22, "Java Developer"));
	tsemp.add(new Employee(105, "Divya", 22000, 22, "Manager"));
	System.out.println("=====Stored default by ID=====");
	
	for (Employee employee : tsemp) {
		System.out.println(employee);
	}
	System.out.println("=====Tree Set By Name=====");
	
	TreeSet<Employee> empName=new TreeSet<Employee>(new SortByName());
	empName.addAll(tsemp);
	
	for (Employee employee : empName) {
		System.out.println(employee);
	}
	
	System.out.println("=====Tree Set By Designation=====");
	TreeSet<Employee> tsDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
	tsDes.addAll(tsemp);
	
	for(Employee employee : tsDes) {
		System.out.println(employee);
	}
	}
}

