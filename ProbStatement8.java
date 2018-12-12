package com.capgemini;

import java.util.Arrays;

public class ProbStatement8 {
	
	 public int solution(int[] A) {
	        int N = A.length;
	        Arrays.sort(A);
	        int tail = 0;
	        int head = N - 1;
	        int minAbsSum = Math.abs(A[tail] + A[head]);
	        while (tail <= head) {
	            int currentSum = A[tail] + A[head];
	            minAbsSum = Math.min(minAbsSum, Math.abs(currentSum));
	          
	            if (currentSum <= 0)
	                tail++;
	            else
	                head--;
	        }
	        return minAbsSum;
	    }
	    public static void main(String[] args) {
			int[] A={2,-4,6,-3,9};
			ProbStatement8 pbs=new ProbStatement8();
			System.out.println(pbs.solution(A));
		}
	}


