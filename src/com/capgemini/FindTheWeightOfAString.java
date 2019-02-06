package com.capgemini;

import java.util.Scanner;

public class FindTheWeightOfAString {

	public static void main(String[] args) {
	int a=64;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=scn.nextLine().toUpperCase();
	char[] ch=str.toCharArray();
	int total=0;
	
	for(int i=0;i<ch.length;i++){
		total+=ch[i]-a;
		
	}
System.out.println(total);
	}
	
	

}
