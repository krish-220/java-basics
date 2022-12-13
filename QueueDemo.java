
//Priority queue is like a from small to large number eg(3,8,10,12)  it will assingn like this only


package com.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList();
		q.add(3);
		q.add(10);
		q.add(8);
		q.add(12);
		System.out.println(q);
		//queue its contains like First in First Out
		System.out.println(q.peek()); // It is use to see the header eg (3)
		System.out.println("head is"  + q.peek());
		// to remove
		System.out.println("to remove" + q.remove());
		
		System.out.println("head is"  + q.peek());
		

	}

}
