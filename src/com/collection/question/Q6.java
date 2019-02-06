package com.collection.question;

import java.util.HashSet;

public class Q6 {
	
	private String s;
	public Q6(String s) { this.s = s; }
 public static void main(String[] args) {
	 HashSet<Object> hs = new HashSet<Object>();
	 Q6 ws1 = new Q6("aardvark");
	 Q6 ws2 = new Q6("aardvark");
	 String s1 = new String("aardvark");
	 String s2 = new String("aardvark");
	 hs.add(ws1); hs.add(ws2); hs.add(s1); hs.add(s2);
	 System.out.println(hs.size()); } 
 
}



