package com.capgemini;

import java.util.Arrays;

public class FindTheMedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 2, 3, 6, 7, 9 };
		int[] arr2 = { 1, 4, 8, 10 ,12,13};
	int count = 0;

		int[] arr3 = new int[arr1.length + arr2.length];

	for (int i = 0; i < arr1.length; i++) {
			arr3[count] = arr1[i];
			count++;
		}
		for (int j = 0; j < arr2.length; j++) {
			arr3[count] = arr2[j];
			count++;
		}
				Arrays.sort(arr3);
		for (int n : arr3) {
			System.out.print(n+" ");
		}
		System.out.println();

		if (arr3.length % 2 == 0) {
			System.out.println("Median=" + arr3.length / 2 +"     Median value=" + arr3[arr3.length / 2]);
		}
		else{
			System.out.println("median value="+arr3[arr3.length/2] );
		}
		
	}

}
