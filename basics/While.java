package com.java.basics;

class DoWhile1{
	public void number() {
		int i = 0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=50);
	}
}

public class While {

	public static void main(String[] args) {
		System.out.println("do while");
		DoWhile1 num = new DoWhile1();
		num.number();
		

	}

}
