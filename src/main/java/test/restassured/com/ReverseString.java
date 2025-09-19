package test.restassured.com;

public class ReverseString {
 public static void main(String args[]) {
	 String s = "I am satyajit";
	 StringBuilder stringBuilder = new StringBuilder(s);
	 StringBuilder newString = stringBuilder.reverse();
	 System.out.println(newString);
 }
}
