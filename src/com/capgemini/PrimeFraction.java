package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFraction {
	
	
	public static List primeFactors(int number) {
		  int n = number;
		  List primeFactors = new ArrayList();
		  for (int i = 2; i <= n; i++) {
		   while (n % i == 0) {
		    primeFactors.add(i);
			 //System.out.println(i);
		    n /= i;
		   }
		  }
		  return primeFactors;
		 }
		 


	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(primeFactors(n));

	}

}
