
//Set: It does not allow duplicate values eg(5,5) it dont allow 5 two times
//Hashing :It is use to store the value and it does not maintain in crt order
//treeset:it is get a output in alphabetical order


package com.java;

import java.util.HashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		TreeSet<String> h = new TreeSet<String>();
		h.add("muthu");
		h.add("krishnan");
		h.add("krish");
		h.add("krish");
		System.out.println(h);
		

	}

}
