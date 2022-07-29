package com.string.programs;

public class IndexofString {
	public static void main(String[] args) {
	String s = "GeeksForGeeks" ; 
	String x = "For";
	int output;
	
	if (s.contains(x)) {
		output = s.indexOf(x);
		System.out.println(output);
	}else {
		System.out.println(-1);
	}
	
	
	}
}
