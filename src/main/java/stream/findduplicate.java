package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class findduplicate {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Ram", "Sita", "Mohan","Ram","hello");
		List<String> duplicates = names.stream().distinct().collect(Collectors.toList());
		System.out.println(duplicates);
		
	}

}
