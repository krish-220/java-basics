package com.java;


class NewClass{
	void useMe(){
		System.out.println("i am using");
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	
}
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hi guys");
		//methodOne();
		//System.out.println(methodTwo(50,40,10));//aruguments
		
		NewClass object = new NewClass();
		object.useMe();
		//int c;
		System.out.println(object.add(10,5));
		
	
		
	}
	public static void methodOne() {
		System.out.println("method1");
	}
	
	static int methodTwo(int num1, int num2, int num3) {//parameter
		return num1+num2+num3;

	}

}
