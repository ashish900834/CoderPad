package com.collection.question;

import java.util.Collection;
import java.util.LinkedList;

public class Q3 {

	
		public static Collection get() {
			 Collection sorted = new LinkedList();
			sorted.add("B");
			sorted.add("C"); 
			sorted.add("A");
		 return sorted;
			 }
			 public static void main(String[] args) {
			 for (Object obj: get()) {
			 System.out.print(obj +"'");
			 }
			 }

	

}


//ANSWER-B,C,A