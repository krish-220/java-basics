package com.java.basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		System.out.println("enter the number:");
		int num1 = reader.nextInt();
		
		if(num1 %2== 0)
		System.out.println(num1 + "is even");
		else
			System.out.println(num1 + "is odd");
			

	}

}
