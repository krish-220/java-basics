
	//Super keyword:
	//The super keyword refers to superclass (parent) objects
	// superclasses and subclasses that have methods with the same name.


package com.java;


class M{
	M(){
		System.out.println("a");
	}
	M(int i){
		System.out.println("i M");
	}
}

class Y{
	Y(){
		System.out.println("b");
	}
	Y(int i){
		Super(i);
		System.out.println("i Y");
	}
}
	



public class Main1 {

	public static void main(String[] args) {
		System.out.println("super keyword");
		// TODO Auto-generated method stub
		Y num = new Y(10);
		


	}

}


