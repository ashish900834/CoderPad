package com.capgemini;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacterInAString {
	
	public static char firstNonRepeatedCharacter(String word) {
		HashMap<Character,Integer> scoreboard = new HashMap<>(); 
		 for (int i = 0; i < word.length(); i++) {
			 char c = word.charAt(i); 
			 if (scoreboard.containsKey(c))
			 {
				 scoreboard.put(c, scoreboard.get(c) + 1);
				 } 
			 else {
				 scoreboard.put(c, 1);
				 }
			 } 
		 for (int i = 0; i < word.length(); i++) {
			 char c = word.charAt(i);
			 if (scoreboard.get(c) == 1) {
				 return c;
				 }
			 }
		 throw new RuntimeException("Undefined behaviour");}
	
	


	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		System.out.println(firstNonRepeatedCharacter(str));

	}

}
