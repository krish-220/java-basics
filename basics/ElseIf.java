package com.java.basics;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int pen = 10;
		int specialPen =25;
		int cost;
		Scanner input = new Scanner(System.in);
		cost = input.nextInt();
		if(cost>specialPen) {
			System.out.println("you can buy this specialpen");
		}
		else if(cost>pen) {
			System.out.println("you can buy this pen");
		}
			else {
				System.out.println("you cannot buy this pen");
			}
			
		}
		
		
		
		
		

	}


