
	//package&imports
	//1. in a same package but diffent class we can acces through a object 
	// egRough obj = new Rough();
		//obj.display();-- this is a 1 package but different class

	//we can also import differnt class from another package with the help of import keyword and package name
	//Dummy obj1 = new Dummy();
	//obj1.display2();-- this is a object from different package and class we use this with the help of import keyword and package name


package com.java;

import com.java.New.Dummy;
	//Dummy is a another class name from another package 
	//import com.java.New-- this is a new package we can import with help of keyword
public class PackageImports {

	public static void main(String[] args) {
		System.out.println("package & import");
		
		Rough obj = new Rough();
		obj.display();
		
		Dummy obj1 = new Dummy();
		obj1.display2();
		

	}

}
