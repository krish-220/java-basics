

// parameter arguments


package com.java;



public class Learning {

	public static void main(String[] args) {
		System.out.println("hi guys");
		methodOne();
		System.out.println(methodTwo(50,40,10));//arguments
		//System.out.println(methodThree());
	
		
	}
	public static void methodOne() {
		System.out.println("method1");
	}
	
	static int methodTwo(int num1, int num2, int num3) {//paramater
		return num1+num2+num3;
		
		
	}
	
	
}


