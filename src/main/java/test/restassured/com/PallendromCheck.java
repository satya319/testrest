package test.restassured.com;
 // check if the provided string is pallendrom or not
public class PallendromCheck {
 public static void main(String args[]) {
	 String s= "tamat";
	 int j=0;
	 char ch [] = s.toCharArray();
	 for(int i=0;i<ch.length;i++) {
		 if(ch[i]==ch[ch.length-i-1]) {
			 System.out.println(i + " th charater is same"+ "====="+ch[i]);
			 j++;
		 }
	 }
	 System.out.println("===="+ j +"====="+(ch.length));
	 if(j==ch.length) {
		 System.out.println("String "+s+" is pallendroom");
	 }
 }
}
