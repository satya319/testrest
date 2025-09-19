package test.restassured.com;

public class CountVowel {
	public static void main(String args[] ){
		String sentence="I am the leader";
		char[] a1 = sentence.toLowerCase().toCharArray();
		int count =0;
		for(int i=0;i<=a1.length-1;i++) {
		if(a1[i]=='a'|| a1[i]=='e'|| a1[i]=='i'||a1[i]=='o'|| a1[i]=='u') {
			count++;
		}
			
		}
		System.out.println("vowel count"+count);
	}

}
