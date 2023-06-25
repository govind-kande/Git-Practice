import java.util.*;
import java.util.stream.*;

public class Sample{
	public static void main(String... args){
		// create a list
		List<Integer> list = Arrays.asList(11,22,33,44,44,55,1,2,3,3,4,5);
		
		// Even numbers	using stream function
		list.stream().filter(l -> l%2 == 0).forEach(System.out::println);
		
		// find out all the numbers starting with 1 using Stream functions?
		list.stream().map(l -> l+"").filter(l -> l.startsWith("1")).forEach(System.out::println);
		Set<Integer> set = new HashSet<>();

		// find duplicate elements in a given integers list in java using Stream functions?
		list.stream().filter(i -> !set.add(i)).forEach(System.out::println);

		
	}
}
