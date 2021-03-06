package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class CollectionsQueueProgram {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<Integer>();
		
		queue.add(123);
		queue.add(456);
		queue.add(145);
		queue.add(268);
		queue.add(890);
		queue.add(123);
		queue.add(310);
		
		System.out.println("size of the queue is "+queue.size());
	
		System.out.println("peek method "+queue.peek());
		//using iterator
		Iterator<Integer> itr=queue.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		queue.add(10);
		System.out.println(queue);
		queue.add(300);
		System.out.println(queue);
		queue.add(20);
		System.out.println(queue);
	
		
		System.out.println(queue.poll());
		
		System.out.println("after poll "+queue);
        System.out.println(queue.poll());
		
		System.out.println("after poll "+queue.remove());
		
        System.out.println(queue.poll());
		
		System.out.println("after poll "+queue);
        System.out.println(queue.poll());
        
        System.out.println(queue.isEmpty());
        
		System.out.println("after poll "+queue);
		System.out.println(" poll() is used to remove the least/smaller numbers first");

	}

}
