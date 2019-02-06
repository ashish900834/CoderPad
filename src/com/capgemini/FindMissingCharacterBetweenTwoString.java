package com.capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindMissingCharacterBetweenTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str= "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Enter the  string");
		String str1=scn.nextLine().toLowerCase().replaceAll(" ","");
		
		Map<Character,Integer> m1=new HashMap<>();
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		for(char c:ch){
		m1.put(c,1);
			}
		//System.out.println(m1);
		
		for(char c1:ch1){
			if(m1.containsKey(c1)){
				m1.put(c1,m1.get(c1)+1);
			}
		}
		//System.out.println(m1);
		
		for(Map.Entry entry:m1.entrySet()){
			
			if(entry.getValue().equals(1)){
				System.out.print(entry.getKey()+" ");
				
			}
		}
	
		

	}

}
