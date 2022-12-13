
//interface
//multiple inheritance cannot support java but with the help of interface we can do multiple inheritance.
// inheritance--extends , interface-- implements
// with interface we can use this abstract,multiple,loose coupling 
//In interface we cannot define a class keyword in parent class instead of this we use interface eg:interface in{}
// In interface we can create method but we did not give any specific value eg:{System.out.println(king");}
// In interface we can create method but it is a default abstract method
// interface method we go to implements in class in1 implements in,inn

package com.java;

interface in { // instead of class we should use interface
	void m4(); // default abstract

	public int m5();
}

interface inn { // we cannot use same name in interface

}

class in1 implements in, inn { // multiple inheritance: i declare 2 class so we have to specify 2 class here

	public void m4() {

	}

	public int m5() {
		return 0;

	}
}

public class Interface {

	public static void main(String[] args) {
		System.out.println("interface");

	}

}
