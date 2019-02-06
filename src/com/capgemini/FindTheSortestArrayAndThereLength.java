/*
Find out the shortest array and its length from the the array group.
Ex:
Given : { {1,2,3,4},{0,2,7},{4,12},{1,2,5,6}

output:
Shortest Array: {4,12}
Length: 2
*/

package com.capgemini;

public class FindTheSortestArrayAndThereLength {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int length;

		int[][] a = { { 1, 2, 3, 4 }, { 0, 2, 7 }, { 4, 12 }, { 1, 2, 5, 6 }};
				
		int small = a[1].length;
		for (int i = 0; i < a.length; i++) {
			length = a[i].length;
			if (length < small) {
				small = length;
			}

		}
		

		System.out.println("Element in smellest array is " + small);
		System.out.print("Elements are ");
		for (int i = 0; i < a.length; i++) {
			if (a[i].length == small) {
				for (int x : a[i]) {
					System.out.print(x+",");
				}
			}
		}

	}

}
