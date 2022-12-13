
// Array list:index,iterator,remove, update



package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		int a[] = new int[5]; //fixed size
		
		ArrayList<Integer> alist = new ArrayList<Integer>(); //flexible
		
		for(int i=1; i<20; i++) {
			alist.add(i);
		   // alist.add(20);
			
		}
		//alist.get(2);
		// to get a index in array list
		System.out.println(alist.get(2));
		   System.out.println(alist);  
		   
		   //to update a value we using a set in array list(0-1) and the set means(0-50)
		   alist.set(0,50);
		   System.out.println(alist);
		  
		   // it is use to remove a value  
		   alist.remove(8);
		   System.out.println(alist);
		   
		   // iterator
		   for(int i:alist) {
			   System.out.println(i);
		   }
		   
		   // It is like to create a iterator object & it is use to take a first element eg(50)
		   Iterator<Integer> i = alist.iterator();
		   System.out.println("using iterator");
		   System.out.println(i.next());
		   
		   while(i.hasNext()) {
			  // System.out.println(i);
			   System.out.println(i.next());
		   }
			   
		   
		ArrayList<String> slist = new ArrayList<String>();
		
		slist.add("muthu");
		slist.add("krishnan");
		System.out.println(slist); //slist-- object
	}

}
