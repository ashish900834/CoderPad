package com.Multithreading.question;
public class Q12 {
 int x=0;
public class Runner implements Runnable {
public void run() {
 int current = 0;
 for(int i=0;i<4;i++){
 current = x;
 System.out.print(current + "," );
 x = current + 2;
 }
}
 }

 public static void main(String[] args) {
 new Q12().go();
 }

 public void go() {
 Runnable r1 = new Runner();
 new Thread(r1).start();
 new Thread(r1 ).start();
 }
 }

