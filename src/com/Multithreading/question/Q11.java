package com.Multithreading.question;

public class Q11 {
private final String name;
private int count;
public Q11(String name) { this.name = name; }
public String getName() { return name; }
public void increment() { count++; }
public int getCount() { return count; }
public void reset() { count = 0; }
}

