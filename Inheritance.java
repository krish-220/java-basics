
	//Single inheritance:(multiple inheritance and hierarichal inheritance)


package com.java;



class add {
	add(){//default constructor
		
	}
	
	add(int a, int b){
	System.out.println(a+b);
	
}
	void run() {
	System.out.println("this is a add class");
	}
}

class sub extends add{// it will call the whole class
	void run1() {
		System.out.println("this is a sub class");
	}
}
class mul extends add{// single : a-b multilevel: a-b-c hierarachial: a-b a-c multiple cannot supported 
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		mul s = new mul();
		s.run();
		s.run1();
	}

}
