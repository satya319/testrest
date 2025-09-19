package test.restassured.com;

public class sortarray {
public static void main(String[] args) {
	int [] input = {20,18,36,16,72,5};
	sortfunction  sf = new sortfunction();
	int []output = sf.sort(input);
	for(int s:output) {
		System.out.println(s);
	}
	
}
}
class sortfunction{
	int[] sort(int a[]){
		
		int n=a.length;
		for(int i = 0;i<n-1;i++) {
			for (int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}