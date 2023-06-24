import java.util.*;
import java.util.stream.*;

public class EvenNumber{
	public static void main(String[] args){
		int number = 22;
		List<Integer> list = Arrays.asList(22,33,11,4,44,1,55,123,3);
		list.stream().map(s -> s+"").filter(a -> a.startsWith("1")).forEach(System.out::println);

	}
}
