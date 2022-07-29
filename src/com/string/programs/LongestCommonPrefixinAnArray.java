package com.string.programs;

public class LongestCommonPrefixinAnArray {
	public static void main(String[] args) {
		int length = 4;
		String[] strs=new String[] {"geeksforgeeks", "geeks", "geek","geezer"};
		if (strs.length == 0) 
		System.out.println("");
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) 
	            System.out.println("");; 	
	        }        
	    System.out.println(prefix);;
	
	}
}
