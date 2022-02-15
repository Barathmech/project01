package org.listops;

import java.awt.List;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ListOperations {
	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		 
		
		//Copying valus from List to Set
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>(li);
		System.out.println("Copied values from List to Set:"+s);
		
		//Finding the length of the List
		int size = li.size();
		System.out.println("List length:"+size);
		
		//To get the last index values in list(without hardcore Index)
		Integer lstindx = li.get(5);
		System.out.println("Last index value:"+lstindx);
		
		//To get first 5 values in the list
		System.out.println("First 5 values of list:");
		for (int i = 0; i < 5; i++) {
			
			System.out.println(li.get(i));
			
		}	
		//To get the middle index value in the list
		int m=size/2;
		System.out.println("Middle Index value is:");
		System.out.println(li.get(m));
		
		//To get the last 5 Index values in List
		System.out.println("Last 5 Index values:");
		for (int i = size-1; i >=1 ; i--) {
			System.out.println(li.get(i));
		}
		//To print the alternate Number in the List
		System.out.println("Print Alternate list values");
		for (int i = 0; i < size; i++) {
			System.out.println(li.get(i));
			i=i+1;
		}
		//Iterate the list using for Loop
		System.out.println("Iteration using for loop:");
		for (int i = 0; i < size; i++) {
			System.out.println(li.get(i));
		}
		//Iterate using for each loop
		System.out.println("Iteration using foreach loop:");
		for (Integer x : li) {
			System.out.println(x);
		}
		}
			
			
	
			
			
			
			
			
			
			
			
		
		}
		
	


