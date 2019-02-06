package com.capgemini;

import java.util.Scanner;

public class PascalTringal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total number of row for pascal tringle");
	int maxRows=sc.nextInt();
		int r, num,j;
		for (int i = 0; i <= maxRows; i++) {
		    num = 1;
		    r = i + 1;
		    //pre-spacing
		    for (j = maxRows - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int col = 0; col <= i; col++) {
		        if (col > 0) {
		            num = num * (r - col) / col;
		        }
		        System.out.print(num + " ");
		    }
		    System.out.println();
		}

	}

}
