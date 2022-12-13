
//overloading:method overloading it contains multiple method  but having a same method name but different in parameter
// compile time 



package com.java;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(5,10);//arguments

	}
	static void add(int num1) {//parameter
		System.out.println(num1 + num1);
	}
	
	
	static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

}			//Static: it wont create a object it will access through class name and method name
