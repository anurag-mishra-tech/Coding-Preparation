package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashCodeNEqualsOverride {
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		
		Person person = new Person("mishra","anurag",false);
		Person person1 = new Person("mishra","anurag",false);
		System.out.println(person.hashCode()+" "+person1.hashCode());
		map.put(person, "IT");
		map.put(person1, "CSE");
		
		map.forEach((k,v) -> System.out.println(k +"\t" +v));
	}
}

/*
 * IF BOTH ARE NOT OVERRIDEN 2 OBJECTS ARE CREATED WITH DIFFERENT HASHCODE AND DUPLICATE PERSON IS INSERTED
 * IF BOTH ARE OVERRIDEN 1 OBJECT is CREATED WITH SAME HASHCODE AND DUPLICATE PERSON IS NOT INSERTED
 * IF ONLY HASHCODE IS OVERRIDEN 2 OBJECT is CREATED WITH SAME HASHCODE AND DUPLICATE PERSON IS INSERTED
 * IF ONLY EQUALS IS OVERRIDEN 2 OBJECT IS CREATED WITH DIFFERENT HASHCODE AND DUPLICATE PERSON IS INSERTED
 */