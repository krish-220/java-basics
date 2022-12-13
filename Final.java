
	//final
	//final keyword should be used for class method variable if we give the final keyword it won't change the value


package com.java;

class Cons{
	final void display() {
		int i = 50;
		System.out.println(50);
	}
	
}

class ok extends Cons{
	
	
}

public class Final {

	public static void main(String[] args) {
		System.out.println("final");
		int i = 10;
		ok obj = new ok();
		obj.display();

	}

}
