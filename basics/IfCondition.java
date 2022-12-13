package com.java.basics;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		 int pen = 10;
		 int cost = 15;
		 Scanner input = new Scanner(System.in);
		cost = input.nextInt();	
		if(cost>pen) {
			System.out.println("you can buy this pen");
			
		}
		else {
			System.out.println("you cannot buy this pen");
		}
	}

}
