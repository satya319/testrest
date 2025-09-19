package test.restassured.com;

public class reverseStringbywordcharacter {
public static void main(String[] args) {
	String input = "I love my India";
	String [] words = input.split(" ");
	StringBuilder sb = new StringBuilder();
	
	for(String word:words) {
		StringBuffer reverseword= new StringBuffer(word);
		String rev = reverseword.reverse().toString();
		sb.append(rev).append(" ");
	}
	System.out.println(sb.toString());
}
}
