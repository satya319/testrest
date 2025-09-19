package stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countfrequency {
public static void main(String args[]) {
	String input = "I am the most popular man in my city";
	Map<Character, Long> freqChr = input.chars().mapToObj(C->(char)C).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
 System.out.print(freqChr);}
}
