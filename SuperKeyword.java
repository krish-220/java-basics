
	//SuperKeyword: is refer to a a super class(parent class)

package com.java;

class Z{
	Z(){
		System.out.println("a");
	}
	Z(int i){
		System.out.println("i M");
	}
	//public void display() {
		// TODO Auto-generated method stub
		
	}


class X extends Z{
	X(){
		System.out.println("b");
	}
	X(int i){
		super(i);
		System.out.println("i Y");
	}
	
}





public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X num = new X(10);

	}

}
