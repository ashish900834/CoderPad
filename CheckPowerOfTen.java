package com.capgemini;

import java.util.Scanner;

public class CheckPowerOfTen {
	
	public static boolean isPowerOfTen(long input){
		if(input%10!=0 || input==0){
			return false;
			
		}
		else if(input==10){
			return true;
		}
		return isPowerOfTen(input/10);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number");
		long number=scn.nextLong();
		System.out.println(isPowerOfTen(number));
		

	}

}
