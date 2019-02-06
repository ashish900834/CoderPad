package com.Multithreading.question;
public class Q2 {
public static void main (String[] args) { new Q2().go();
 }
 public void go() {
 Runnable r = new Runnable() {
 public void run() {
 System.out.print("foo");
 }
 };
 Thread t = new Thread(r);
 t.start();
 t.start();
 }
 }
