package com.capgemini;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++){
			int temp=i;
			int sum=0;
			   while(temp!=0){
				   int reminder=temp%10;
				   sum=sum+(reminder*reminder*reminder);
				   temp=temp/10;
			
			   }
			   if(sum==i){
				   System.out.println(i);
			   }
		
		}


    }
}
