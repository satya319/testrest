package test.restassured.com;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicate {
	public static void main(String args[]) {
		String sentence = "I am the master mind of the plan";
		Map<Character, Boolean> map = new LinkedHashMap();
		StringBuilder newString = new StringBuilder();
		for(char c: sentence.toCharArray()) {
			if(!map.containsKey(c)) {
				map.put(c, true);
				newString.append(c);				
			}
		}
		
		System.out.println("Original String: " + sentence);
        System.out.println("Without Duplicates: " + newString.toString());
	}

}
