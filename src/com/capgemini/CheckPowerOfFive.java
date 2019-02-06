package com.capgemini;

import java.util.Scanner;

public class CheckPowerOfFive {
	
	public static int isPowerOfFive(int n){
		if(n==0){
			return -1;
		}
		
		if(n==5){
			return 1;
		}
		while(n!=1){
			if(n%5!=0){
				return -1;
			}
			n=n/5;
		}
		
		return 1;
		
	}
	
	
	 public static void main(String arg[])	
	 
	  {
		 Scanner scn=new Scanner(System.in);
		 System.out.println("enter the number");
		 int n=scn.nextInt();
		 if(isPowerOfFive(n)==1){
			 System.out.println(n+ " is  power of 5 ");
			 
		 }
		 else{
			 System.out.println(n + " is not power of 5");
		 }
		
	  }

}
