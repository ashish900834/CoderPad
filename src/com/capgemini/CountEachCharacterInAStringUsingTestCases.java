package com.capgemini;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CountEachCharacterInAStringUsingTestCases {

	public static Map<Character,Integer> CountCharacter(String str){
		char[] ch=str.toCharArray();
		Map<Character,Integer> m1=new HashMap<>();
		int count=0;
		
		for(char ch1:ch){
			
			if(m1.containsKey(ch1)){
				m1.put(ch1,m1.get(ch1)+1);
			}
			else{
				m1.put(ch1,1);
			}
			
		}
		
		//Different ways to iterate over map
		
	/*	
		for(Map.Entry ch2:m1.entrySet()){
			System.out.println(ch2.getKey()+"         "+  ch2.getValue());
			
		}*/
		
		
		
		Set<Character> st=m1.keySet();
		
		Iterator<Character> i1=st.iterator();
		
		while(i1.hasNext()){
			Character c=i1.next();
			Integer n=m1.get(c);
			System.out.println(c+"    "+n);
		}
		return m1;
		

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		CountCharacter(str);
		
	}

}
