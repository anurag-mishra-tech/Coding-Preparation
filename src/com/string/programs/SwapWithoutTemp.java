package com.string.programs;

public class SwapWithoutTemp  {
	/* Swap String Values Without Using Temporary Variable */
	public static void main(String[] args) {
		String a = "Anurag";
		String b = "Mishra";
		System.out.println("Before swap: " + a + " " + b);  
		
		a = a + b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println("After swap: " + a + " " + b);  
		
	}
}
