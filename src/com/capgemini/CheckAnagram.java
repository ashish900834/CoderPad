// CHECK THE STRING IS ANAGRAM OR NOT

package com.capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the first word");
		String word=scn.nextLine().replaceAll("\\s+","");
		System.out.println("Enter the second word");
		String word1=scn.nextLine().replaceAll("\\s+","");
		int count=word.length();
		int count1=word1.length();
		char[] ch1=word.toCharArray();
		char[] ch2=word1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	/*	if(count!=count1){
			System.out.println("it is not a Anagram string");
		}
		else if(Arrays.equals(ch1,ch2)){
			System.out.print("it is a Anagram string");
			
		}
		else{
			System.out.println("it is not a anagram String");
		}*/
		
		if(count==count1 && Arrays.equals(ch1,ch2)){
			System.out.println("it is a anagram string");
			
		
		}
		else{
			System.out.println("it is not a anagram string");
		}
	
	}

}
