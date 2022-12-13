
		//inner class
		//Its is specify a 1 class inside a another class


package com.java;

class s1{
	
	void s1m() {
		System.out.println("s1m");
	}
	
	
	class s8{
		void s8m() {
			System.out.println("s8m");
		}
		
	}
}




public class InnerClass {

	public static void main(String[] args) {
		System.out.println("classes");
		s1 o = new s1();
		o.s1m();
		
		s1.s8 o1 = o.new s8();		//s1 -- class name
		o1.s8m();					//s2--It hide inside the class s1
									//o.new -- o is a previous object of s1

	}

}
