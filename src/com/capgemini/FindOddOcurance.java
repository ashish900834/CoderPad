package com.capgemini;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;



public class FindOddOcurance {
	
	
	public static int  solution(int[] arr){      
		Map<Integer,Integer> m=new HashMap<>();
		int count=0;
		for(int f:arr){
			//System.out.println(f);
			if(m.containsKey(f))
				m.put(f,m.get(f)+1);
			else
			{
				m.put(f,1);
			}
		}
		
     for(Map.Entry entry:m.entrySet()){
			
			if(entry.getValue().equals(1)){
				count=(int) entry.getKey();
				//System.out.println(entry.getKey());
				
			}
     }
     return count;
}
	
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
 int[] arr={9,3,9,3,9,7,9,8};
 System.out.println(solution(arr));
}
}


