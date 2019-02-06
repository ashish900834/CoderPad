//Write a program to find out the words which is starting with character s??

package com.capgemini;

import java.util.Scanner;

public class StartingWithS {

	public static void main(String[] args) {
		System.out.print("Enter how many Words want to enter: ");
		Scanner scn=new Scanner(System.in);
		int numOfWords = Integer.parseInt(scn.nextLine());
 
		//Create a string array to store the names of your friends
		String s[] = new String[numOfWords];
		for (int i = 0; i < s.length; i++) {
			System.out.print("Enter the " + (i+1) + " word : ");
		       s[i] = scn.nextLine();
		}
		
		
		
		
	//String[] s={"Str","searching","sorting","nayak","sgt","jui" ," stuht"};
	int j=0;
	for(int i=0;i<s.length;i++){
		String s1=s[i].toLowerCase().replaceAll("\\s+","");
		
		char[] ch=s1.toCharArray();
		  if(ch[j]=='s'){
			  System.out.println(s1);
			  
		  }
	}
		

	}

}
