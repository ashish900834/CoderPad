package com.Multithreading.question;
 public class Q14 {
	 public static void main(String[] args) {
		 
		 Q14 q=new Q14();
		 q.go();
	 }
		

 private int x;
 public synchronized void foo() {
	 int current = x;
x = current + 1;
System.out.print(x + ", ");
 }
 public void go() {
	// synchronized(this){
 for(int i=0;i<5;i++) {
 new Thread() {
 public void run() {
 foo();
 
 } }.start();
 }
 }}//}
