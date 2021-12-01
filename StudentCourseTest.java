package com.naidu.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentCourseTest {

	public static void main(String[] args) {
		
		
		List<Course> listOfCourse = new ArrayList<>();
		listOfCourse.add(new Course("c"));
		listOfCourse.add(new Course("java"));
		listOfCourse.add(new Course("aws"));
		
		List<Course> listOfCourse1 = new ArrayList<>();
		listOfCourse1.add(new Course("c"));
		listOfCourse1.add(new Course("java"));
		listOfCourse1.add(new Course("aws"));
		
		List<Course> listOfCourse2 = new ArrayList<>();
		listOfCourse2.add(new Course("c"));
		listOfCourse2.add(new Course("java"));
		listOfCourse2.add(new Course("c++"));
		
		List<Student> list =new ArrayList<>();
		list.add(new Student(101, "janu", listOfCourse));
		list.add(new Student(102, "raji", listOfCourse1));
		list.add(new Student(101, "ravi", listOfCourse2));
		
		
		List<Course> listOfCourses = new ArrayList<>();
		for (Student s : list) {
			listOfCourses.addAll(s.getCourses());
		}
		List<String> courses = new ArrayList<>();
		for (Course course : listOfCourses) {
			courses.add(course.getCourseName());
		}
		 System.out.println(courses);
		 
		 //Now we can count the number of students enrolled for each course;
		 Map<String,Long> map = courses.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 System.out.println(map);
	}

}
