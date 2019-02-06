package com.collection.question;

		public class Q8 implements Comparable<Q8> {
		 private int wins, losses;
		public Q8(int w,int l) { wins = w; losses = l; }
		public int getWins() { return wins; }
		 public int getLosses() { return losses; }
		 public String toString() {
		 return"<" + wins +"," + losses +">";
		}
		 // insert code here
		@Override
		public int compareTo(Q8 arg0) {
		
			return 0;
		}
		 }



