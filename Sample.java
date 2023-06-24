import java.util.*;
import java.util.stream.*;

public class Sample{
	public static void main(String... args){
		// create a list
		List<Integer> list = Arrays.asList(11,22,33,44,44,55,1,2,3,3,4,5);
		
		// Find out all the even numbers exist in the list using Stream functions?
		System.out.println();
		// Even numbers	
		list.stream().filter(l -> l%2 == 0).forEach(System.out::println);
		
		// Find out all the numbers starting with 1 using Stream functions?
		System.out.println();
		list.stream().map(l -> l+"").filter(l -> l.startsWith("1")).forEach(System.out::println);
		Set<Integer> set = new HashSet<>();

		// Find duplicate elements in a given integers list in java using Stream functions?
		System.out.println();	
		Set<Integer> duplicates = new HashSet<>();
		list.stream().filter(l -> !duplicates.add(l)).forEach(System.out::println);
		
		// Find the first element of the list using Stream functions ?
		System.out.println();
		System.out.println(list.stream().findFirst().get());

		
	}
}
