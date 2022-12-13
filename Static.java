package com.java;

class Student{
	int rollno;
	int class_;
	static String principal;
	
	void display() {
		System.out.println("hi");
	}
	
}

public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student muthu = new Student();
		muthu.rollno = 123;
		muthu.class_ = 10;
		Student.principal = "velu";
		
		
		Student krish = new Student();
		krish.rollno = 234;
		krish.class_ = 12;
		Student.principal = "velu";
		System.out.println(Student.principal);

	}

}
