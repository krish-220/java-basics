

	//THIS PROGRAM it contains same name in local & instance variable so compiler get confuse. so only we use this keyword



package com.java;
class This{
	
	int number1;// variable declared inside the class and outside the method is called instance variable
	
	public This(int number1 ) {/*//int number 1 is a parameter*/
		this.number1 = number1;
		//int a=89; local variable
		//super();
		// TODO Auto-generated constructor stub
		
		
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is keyword");
		This object = new This(10);
		System.out.println(object.number1);

	}

}
