
	//abstract:
	// we can use normal method in abstract class 
	// we can declare abstract method like abstract void running();
	// we cannot declare abstract method in normal class
	// we create a object in main class eg: super class and sub class bike obj = new pulsar
	// abstract is hiding the details and showing only functionality to user
	// interface and abstract cannot create object

package com.java;

abstract class Bike{
	abstract void run();
	
}

class Pulsar extends Bike{
	void run(){
		System.out.println("running safely");
	}

}

public class Abstract {

	public static void main(String[] args) {
	
		Bike obj = new Pulsar();
		
		obj.run();

	}

}
