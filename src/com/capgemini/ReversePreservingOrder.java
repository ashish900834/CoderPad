package com.capgemini;

import java.util.Scanner;

public class ReversePreservingOrder {
	
	  static void reverses(String str) {  
          
	        char[] inputArray = str.toCharArray();  
	        char[] result = new char[inputArray.length];  
	  
	       
	        for (int i = 0; i < inputArray.length; i++) {  
	            if (inputArray[i] == ' ') {  
	                result[i] = ' ';  
	            }  
	        }  
	          
	      
	        int j = result.length - 1;  
	        for (int i = 0; i < inputArray.length; i++) {  
	              
	              
	                if (inputArray[i] != ' ') {  
	                                  
	              
	                    if (result[j] == ' ') {  
	                        j--;  
	                    }     
	                    result[j] = inputArray[i];  
	                    j--;  
	                }  
	        }  
	        System.out.println(String.valueOf(result));  
	    }     
	      

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		reverses(s);
		
	}

}
