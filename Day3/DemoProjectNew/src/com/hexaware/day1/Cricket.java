package com.hexaware.day1;

public class Cricket {

	static int score;
	
	public void increment(int x) {
		score+=x;
	}
	
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		
		fb.increment(52);
		sb.increment(11);
		ext.increment(8);
		
		System.out.println("Total Score   " +Cricket.score);
	}
}
