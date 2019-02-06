package com.collection.question;

public class Q12 {

	 private String name;
   public Q12(String name) {
     this.name = name;
	 }
	
		 
			 public boolean equals(Object o) {
			 if( !(o instanceof Q12) ) {
				 return false;
			 }
			 Q12 p = (Q12) o;
			 return p.name.equals(this.name);
			 }
			 public static void main(String[] args) {
				 
				 Q12 q1=new Q12("Ashish");
				 Q12 q2=new Q12("Ashi");
				 Q12 q3=new Q12("Ashippsh");
				 Q12 q4=new Q12("A");
				 Q12 q5=new Q12("Ashish");
				 
				 if(q1.equals("Ashish")){
					 System.out.println("hello");
				 }
				 
				
				 
					 

	}

}
