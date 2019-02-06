package com.capgemini;

import java.util.Scanner;

public class UniqueSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string, sub;

		int i, c, length;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string to print it's all substrings");

		string = in.nextLine();
		System.out.println("Enter the length of the string");
		int l=in.nextInt();

		length = string.length();

		System.out.println("Substrings of \"" + string + "\" are:");

		for (c = 0; c < length; c++)

		{

			for (i = 1; i <= length - c; i++)

			{

				sub = string.substring(c, c + i);
				if(sub.length()==l){
				

				System.out.println(sub);
				}
			}

		}

	}

}
