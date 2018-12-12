//CHECK THE STRING IS PANAGRAM OR NOT


package com.capgemini;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckPanagram { 
	  public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.println("ENTER THE STRING");
	        String sentence = scan.nextLine();
	        sentence = sentence.toUpperCase();
	        sentence = sentence.replaceAll("[^A-Z]", "");
	        System.out.println(sentence);

	        char[] chars = sentence.toCharArray();

	        Set<Character> set = new HashSet<Character>();

	        for( int i = 0; i < chars.length; i++ )
	        	set.add(chars[i]);

	        System.out.println(set.size() == 26 ? "pangram" : "not pangram");

	    }
	}