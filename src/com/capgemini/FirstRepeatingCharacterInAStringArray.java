package com.capgemini;

import java.util.HashSet;

public class FirstRepeatingCharacterInAStringArray {
	
	 static char firstRepeating(char str[]) 
	    { 
	      
	        HashSet<Character> h = new HashSet<>(); 
	  
	        for (int i=0; i<=str.length-1; i++) 
	        { 
	            char c = str[i]; 
	  
	            if (h.contains(c)) 
	                return c; 
	  
	            else
	                h.add(c); 
	        } 
	  
	        return '\0'; 
	    } 
	 
	    public static void main (String[] args) 
	    { 
	       String[] str={"array","apple","rat"};
	       for(int i=0;i<str.length;i++){
	    	   
	       }


}
}
