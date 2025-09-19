package test.restassured.com;

public class ReverseWord {
	public static void main(String args[]) {
		String sentence=" I am success in my life";
		StringBuilder result = new StringBuilder();
		StringBuilder word = new StringBuilder();
		for (char ch : sentence.toCharArray()) {
			if(Character.isWhitespace(ch)) {
				result.append(word.reverse());
				word.setLength(0);
				result.append(ch);
			}else {
				word.append(ch);
			}
		}
		result.append(word.reverse());
		System.out.println(result);
		}

}
