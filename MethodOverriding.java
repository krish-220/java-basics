
	//MethodOverriding: run time 
	//if we run the method overriding the two class method should be in same name
	//sub class / child class has more power compare to parent class /superclass


package com.java;

class Y1{
	void display(){
		System.out.println("y class");
	}
}

class M1 extends Y1{
	void display(){
		System.out.println("m class");
		// sub class / child class has more power compare to parent class /superclass
	}
	
}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 num = new M1();
		num.display();
		

	}

}
