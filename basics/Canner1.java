package com.java.basics;

import java.util.Scanner;

public class Canner1 {

	public static void main(String[] args) {
		String name;
		int number1;
		int number2;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a name:");
		name = input.nextLine();
		number1 = input.nextInt();
		number2 = input.nextInt();
		System.out.println("hi,"+name+""+name.toUpperCase());
		
		System.out.println(number1+number2);
		
		

	}

}
