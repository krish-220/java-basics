

	//exception handling
	/*try-- we will try anything we will get positive results means its ok otherwise ,
 	negative results means we should be mention it in catch block*/

 	//catch--In the code get error in try block it will move to catch block and execute it.


 	//catch(Exception ex)-- catch its a block 
 	//(Exception)-- is a keyword
 	//(Exception ex)-- ex is a variable we need to create

 	/*try block will run the code its ok means the answer will be displayed.
 	otherwise the code get error means it will go to catch block.*/
	//finally block :whatever in the finally block its always excute.
	// In a exception handling there is a only one try and finally block but we can crete lots of catch block
	//throws means we have to declare any condition and its a user define function



package com.java;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("exception handling");
		
	try {
		int number1;
		Scanner input = new Scanner(System.in);	// to get a input from user
		number1 = input.nextInt();
		System.out.println(number1);
		}
	catch(Exception ex) {
		System.out.println("only number are accepted");
		
	}
	finally {
		System.out.println("always excute");	//default value means finnaly
	}
	//throw
	try {
		int num = 101;
		if(num ==101)
			throw new Exception();		// user define function
			
	}
	catch(Exception a) {
		System.out.println("yes");
	}

	}
}


