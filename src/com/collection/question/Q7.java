package com.collection.question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q7 {

		enum Example { ONE, TWO, THREE }
		public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		 coll.add(Example.TWO);
		coll.add(Example.ONE);
	    Set set = new HashSet(coll);
	    
	    Iterator it=set.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	    


	}

}
