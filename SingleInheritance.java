
// Normal  Single Inheritance

package com.java;



class Add1{
	Add1(){//Default constructor
		
	}
	Add1(int a, int b){
		System.out.println(a+b);
	}
}
class Sub1 extends Add1{// it will call tha whole class of Add1
	Sub1(int a, int b){
		System.out.println(a-b);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add1 a = new Add1(10,5);
		Sub1 b = new Sub1(10,5);

	}

}
