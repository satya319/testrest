package test.restassured.com;

public class Bubbleshort {
public static void main(String args[]) {
	int input[] = {5, 6,8,2,3,1,101,20,45,47,78,99,88};
	int n = input.length;
	for(int i =0;i<n-1;i++) {
		for(int j = 0;j<n-i-1;j++) {
			if(input[j]>input[j+1]) {
				int temp = input[j];
				input[j]=input[j+1];
				input[j+1]=temp; 
			}
		}
	}
	for(int x:input) {
		System.out.print(x + " ");
	}
}
}
