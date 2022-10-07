package com.string.programs;

public class RemoveCommonCharactersandConcatenate {
	public static void main(String[] args) {
		/*
		 * String s1 = "aacdb"; String s2 = "gafd";
		 */
		
		String s1 = "abcs";
		String s2 = "cxzca";
		String output = OptimizedconcatenatedStringSolution(s1, s2);
		System.out.println(output);

	}

	static String concatenatedString(String s1, String s2) {
		String[] char1 = s1.split("");
		String[] char2 = s2.split("");
		String output = "";
		for (String str : char1) {
				if (s1.contains(str) && s2.contains(str)) {
					s1 = s1.replace(str,"");
					s2 = s2.replace(str,"");
			}
		}
		output = s1+s2; 
		if(output.isEmpty()) 
		{
			output="-1"; 
			return output;
		}
		return output;
	}
	
	static String OptimizedconcatenatedStringSolution(String s1, String s2) {
		String s = "";
	       for(int i=0; i<s1.length(); i++)
	       {
	           char ch = s1.charAt(i);
	           if(!s2.contains(String.valueOf(ch)))
	           {
	               s = s + ch;
	           }
	       }
	       
	       for(int i=0; i<s2.length(); i++)
	       {
	           char ch = s2.charAt(i);
	           if(!s1.contains(String.valueOf(ch)))
	           {
	               s = s + ch;
	           }
	       }
	       if(s.isEmpty()) s="-1";
	       return s;
	}
}
