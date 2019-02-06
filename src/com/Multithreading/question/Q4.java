package com.Multithreading.question;

public class Q4 {
	
		 public static void main (String[] args) {
		new Thread(new Runnable() {
		 public void run() {
		 System.out.print("bar");
		}}).start();
		}
		}



