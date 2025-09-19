package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filtereven {
	public static void main(String[] args) {
		//int[] input = {};
		List<Integer> inone=Arrays.asList(2,3,4,5,6,9,11,12,8,56,45,33,22,27,28);
		List<Integer> output= inone.stream().filter(n-> n % 2==0).collect(Collectors.toList());
		System.out.println(output);
	}
	
}
