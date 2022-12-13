

//Constructor:In this program having constructor and default constructor just refer notes
// class name 


package com.java;

class Dog{ // class
	int age;  // data member
	String color;
	
	Dog(){
		age =1;
		 color="sandal";
	}
	
	Dog(int a, String c){
		
		age= a;
		color =c;
	}

	 public void Eat() {  // method
		System.out.println("the dog is eating");
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog lab= new Dog(3 ,"white");
		//lab.age= 3;
		//lab.color="white";
		
		Dog sherped = new Dog();
		sherped.age= 2;
		sherped.color="brown";
		
		lab.Eat();
		System.out.println(lab.age);

	}

}
