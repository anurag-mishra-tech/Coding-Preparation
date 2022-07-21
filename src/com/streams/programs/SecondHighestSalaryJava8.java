package com.streams.programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.pojo.Employee;

public class SecondHighestSalaryJava8 {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		Employee employee1 = new Employee(1, "1", 10000);
		Employee employee2 = new Employee(2, "2", 20000);
		Employee employee3 = new Employee(3, "3", 30000);
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		Optional<Employee> emp = employeeList.stream()
		        .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println(emp.toString());
	}

}
