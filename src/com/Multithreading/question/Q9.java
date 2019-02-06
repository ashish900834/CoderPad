package com.Multithreading.question;

public class Q9 implements Runnable {
 public static void main (String[] args) throws Exception {
 Thread t = new Thread(new Q9());
 t.start();
 System.out.println("Started");
 t.join();
System.out.println("Complete");
}
 public void run() {
 for (int i= 0; i< 4; i++) {
 System.out.println(i);
 }
 }
 }
