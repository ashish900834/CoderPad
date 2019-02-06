package com.capgemini;

import java.util.Scanner;

public class NumerologyNumberFromString {

	public static void main(String[] args) {
	int	A,I,J,Q,Y= 1;
	int	B,K,R=2;
	int	C,G,L,S= 3;
	int	D,M,T =4;
	int	E,H,N,X=5;
	int	U,V,W=6;
	int	O,Z=7;
	int	F,P=8;
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=scn.nextLine().toUpperCase();
	int sum=0;
	int temp=0;
	char[] ch=str.toCharArray();
	for(int i=0;i<ch.length;i++){
		sum=sum+ch[i];
	}
	/*while(sum!=0){
		int rem=sum%10;
		temp=temp+rem;
		sum=sum/10;
		
	}*/
	System.out.println(sum);

	}

}
