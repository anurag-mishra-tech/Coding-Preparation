package com.streams.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.pojo.Employee;

public class SortEmployeesArrayListByNameAndSalary {

	public static void main(String[] args) {

		// create an ArrayList of employee objects
		List<Employee> employeeList = new ArrayList<>();

		Employee employee1 = new Employee(1, "John", 10900);
		employeeList.add(employee1);
		Employee employee2 = new Employee(2, "Ed", 10100);
		employeeList.add(employee2);
		Employee employee3 = new Employee(3, "Gary", 10200);
		employeeList.add(employee3);
		Employee employee4 = new Employee(4, "Mike", 10700);
		employeeList.add(employee4);
		Employee employee5 = new Employee(5, "Steve", 10300);
		employeeList.add(employee5);
		// Sort Employees by salary
		List<Employee> employeeOut = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
		System.out.println("Sorted by Employee Salary --->");
		employeeOut.stream().forEach(s -> System.out.println(s.toString()));
	}

}