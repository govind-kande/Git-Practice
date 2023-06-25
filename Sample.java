import java.util.*;
import java.util.stream.*;

public class Sample{
	public static void main(String... args){
		// create a list
		List<Integer> list = Arrays.asList(11,22,33,44,44,55,1,2,3,3,4,5);
		
		// Even numbers	using stream function
		System.out.println("Even numbers");
		list.stream().filter(l -> l%2 == 0).forEach(System.out::println);
		
		// Find out all the numbers starting with 1 using Stream functions?
		System.out.println("Starts with 1");
		list.stream().map(l -> l+"").filter(l -> l.startsWith("1")).forEach(System.out::println);
		Set<Integer> set = new HashSet<>();

		// Find duplicate elements in a given integers list in java using Stream functions?
		System.out.println("Duplicate elements");	
		Set<Integer> duplicates = new HashSet<>();
		list.stream().filter(l -> !duplicates.add(l)).forEach(System.out::println);
		
		// Find the first element of the list using Stream functions?
		System.out.println("First element in the list");
		System.out.println(list.stream().findFirst().get());

		// Find the total number of elements present in the list using Stream functions?
		System.out.println("Number of elements");
		System.out.println(list.stream().count());

		// Find the maximum value element present in it using Stream functions? 
		System.out.println("Max value from list");
		System.out.println(list.stream().max((i,j) -> i.compareTo(j)).get());

		// Find the first non-repeated character in it using Stream functions?
		List<String> strList = Arrays.asList("find the first non-repeated character in it using Stream functions ? ");

	}
}