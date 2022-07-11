package com.assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DeleteAllDuplicate {

	public static void main(String[] args) {
		
    Scanner scan=new Scanner(System.in);
    System.out.println("enter num1");
    int num1=scan.nextInt();
    System.out.println("enter num2");
    int num2=scan.nextInt();
    System.out.println("enter num3");
    int num3=scan.nextInt();
    System.out.println("enter num4");
    int num4=scan.nextInt();
    System.out.println("enter num5");
    int num5=scan.nextInt();
    List<Integer> list=new LinkedList<>();
    list.add(num1);
    list.add(num2);
    list.add(num3);
    list.add(num4);
    list.add(num5);
    System.out.println("-----------------------------------");
    System.out.println("List with unique values: ");
    System.out.println();
    
   //  System.out.println(list);
    
    
    Set<Integer>set=new LinkedHashSet<Integer>(list);
    System.out.println(set);
  
}
}
