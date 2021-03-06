package com.collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeProgram {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.add(256);
		queue.add(456);
		queue.add(324);
		queue.add(789);
		queue.add(821);
		queue.add(391);
		queue.add(112);
		System.out.println(queue);
		Iterator<Integer> itr=queue.iterator();
		
		System.out.println("arrayDeque follows insertion order");
		for(int i:queue)
		{
			System.out.println(i);
		}
		System.out.println(queue);
		queue.push(920);
		queue.push(100);
		queue.push(530);
		System.out.println(queue);
		//insert the given value at first place
		System.out.println(queue.offerFirst(100));
		//insert the given value at last place
		System.out.println(queue.offerLast(100));
		System.out.println("------------------------");
		System.out.println(queue);
		System.out.println(queue.getFirst());
		queue.addFirst(12);
		
	}

}
