package com.capgemini;

import java.util.Scanner;

public class CyclicRotation{
  
  
  
  public  int[] solution(int[] a,int k){
    
    int length=a.length;
    if(length==0||length==1){
      return a;
    }
    for(int i=0;i<k;i++){
      for(int j=length-1;j>0;j--){
        int temp=a[j];
        a[j]=a[j-1];
        a[j-1]=temp;
      }
    }
    return a;
    
    
    
    
  }
  
  public static void main(String args[]){
    
    int[] a={3,8,9,7,6};
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the rotation");
    int r=scn.nextInt();
    CyclicRotation sol=new CyclicRotation();
    int[] result=sol.solution(a,r);
    System.out.print("[");
    for(int extract:result){
      System.out.print(extract+",");
    }
    System.out.print("]");
    
  }
    
  }
  
  
  
  
  

  
  

