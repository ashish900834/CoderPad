package com.capgemini;

import java.util.Scanner;

public class FibonasicSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number that you want the series");
		int n=scn.nextInt();
		int startNum=0;
		int secondNum=1;
		System.out.print(startNum+","+secondNum);
		int finalNum;
		for(int i=1;i<=n;i++){
			finalNum=startNum+secondNum;
			System.out.print(","+finalNum);
			startNum=secondNum;
			secondNum=finalNum;
		}
	

	}

}
