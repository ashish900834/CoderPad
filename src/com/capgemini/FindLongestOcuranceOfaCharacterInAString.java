package com.capgemini;

import java.util.Scanner;

public class FindLongestOcuranceOfaCharacterInAString {

public static void main(String[] args) {

    Scanner inp= new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=inp.nextLine();

    String result="";
    StringBuilder sb = new StringBuilder(str);


    while(sb.length() != 0){
        int count = 0;
        char test = sb.charAt(0);
        while(sb.indexOf(test+"") != -1){
            sb.deleteCharAt(sb.indexOf(test+""));
            count++;
        }
        //System.out.println(test+" is repeated "+count+" number of times");
        result=result+test+count;
    }
    System.out.println(result);  
}

}

