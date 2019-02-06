package com.capgemini;

import java.util.Scanner;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int temp=n;
		int flag=0;
		
		while(temp!=1){
			if(temp%2!=0){
				flag=1;
			}
			temp=temp/2;
			
		}

		if(flag==0){
			System.out.println(n+" is a power of 2");
		}
		else{
			System.out.println(n+" is not  power of 2");
		}
	}

}
