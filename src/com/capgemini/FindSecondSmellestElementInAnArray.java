package com.capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondSmellestElementInAnArray {
	
	
	
	public static int getSecondSmallest(int[] a){  
		Arrays.sort(a);  
		return a[1];  
		}  

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scn.nextInt();
		int[] array=new int[size];
		//System.out.println("Enter the number to the array");
		for(int i=0;i<array.length;i++){
			System.out.println("Enter the " +i+ "  number to the array");
			array[i]=scn.nextInt();

			
		}
		
	
		System.out.println(getSecondSmallest(array));
	}

}
