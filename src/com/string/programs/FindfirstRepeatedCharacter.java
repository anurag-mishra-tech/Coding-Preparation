package com.string.programs;

public class FindfirstRepeatedCharacter {
	public static void main(String[] args) {
		String s = "geeks";
		String str = firstRepChar(s);
		System.out.println(str);
		
	}
	
	  static String firstRepChar(String s) 
	    { 
	        // code here
	        String[] strArr = s.split("");
	        StringBuilder output = new StringBuilder();
	        for (String str : strArr){
	            if (!output.toString().contains(str)) {
	            	output.append(str);
				}else {
					return str;
				}
	        }
	        System.out.println(output);
			return "-1";
	    }
}
