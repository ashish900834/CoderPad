package com.capgemini;

import java.util.Scanner;

public class ReomveDuplicate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scn.nextLine();
		String[] str1=str.split("\\s+");
		for(int i=0;i<str1.length;i++){
			if(str1[i]!=null)
			for(int j=i+1;j<str1.length;j++){
				if(str1[i].equals(str1[j])){
					str1[j]=null;
				}
			}
		}
		
		
		for(int k=0;k<str1.length;k++){
			if(str1[k]!=null)
			System.out.print(str1[k]+" ");
			
		}
		
		
		
		
	}
	

}
