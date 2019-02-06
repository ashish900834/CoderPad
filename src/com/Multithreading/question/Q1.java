package com.Multithreading.question;

public class Q1 implements Runnable {
 public void run() {
System.out.print("running");
 }
 public static void main(String[] args) {
Thread t = new Thread(new Q1());
 t.run();
 t.run();
 t.start();
}
 }
