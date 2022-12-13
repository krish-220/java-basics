package com.java;

public class ParameterizedConstructor {
	int id;
	String name;
	
	public ParameterizedConstructor(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("ID :"+id+" Name :"+name);
	}
//	public void show()
//	{
//		System.out.println("ID :"+id+" Name :"+name);
//	}
	
  public static void main(String args[])
  {
	  ParameterizedConstructor ps=new ParameterizedConstructor(101, "Krishnan D Muthu");
	  
  }
}
