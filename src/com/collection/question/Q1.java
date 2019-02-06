package com.collection.question;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		Object[] myobjects={new Integer(12),new String("foo"),new Integer(5),new Boolean(true)};
		Arrays.sort(myobjects);
		for(Object obj:myobjects){
			System.out.println(myobjects);
		}
	}

}
