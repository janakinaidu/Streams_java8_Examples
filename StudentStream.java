package com.naidu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStream {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "raju", 85000));
		list.add(new Student(102, "rani", 50000));
		list.add(new Student(103, "king", 7000));
		list.add(new Student(104, "queen", 10000));
		list.add(new Student(105, "ravi", 20000));
		
		//Now i want, list of Employees whose salary is > 30000;
		List<Student> newList = list.stream().filter(s->s.getSalary()>30000).collect(Collectors.toList());
		newList.forEach(System.out::println);
	}

}
