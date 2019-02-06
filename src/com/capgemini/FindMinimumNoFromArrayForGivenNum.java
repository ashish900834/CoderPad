/*
For the given Array, accept the target value as input and find out the sum of minimum elements required to find the target value.

Example :
Array : { 1,2,3,4}
Target Value = 6
out put = 2+4 =6   return 2  element required .

*/





package com.capgemini;

import java.util.Scanner;

public class FindMinimumNoFromArrayForGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4};
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		int count=0;
		
	if(num<=a[0]+a[1]+a[2]+a[3]){
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length;j++){
				if(a[i]+a[j]==num){
					count++;
					System.out.println(a[i]+","+a[j]);
					
					
				}
			}
			
			
		}
	
		System.out.println("Total count = "+count);

	}
	else{
		System.out.println("Target value out of scope "+-1);
	}
	}

}
