package com.array.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SumSquareOddNumbers {
	public static void main(String[] args) {
		List<Integer> s =new ArrayList<Integer>();
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		
	Integer out =  s.stream().filter(x -> x%2 !=0).map(x -> x*x).mapToInt(Integer::intValue).sum();
	System.out.println(out);
	


	
	}
}
