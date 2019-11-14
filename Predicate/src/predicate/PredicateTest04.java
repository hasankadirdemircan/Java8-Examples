package predicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest04 {

	public static void main(String[] args) {
		List<String> stringTempList = new ArrayList<>();
		stringTempList.add("java8");
		stringTempList.add("hasan");
		stringTempList.add("kadir");
		stringTempList.add("demircan");
		stringTempList.add("hello");
		
		//default boolean removeIf(Predicate<? super E> filter)
		//Burada Predicate ayri yazip ekleyedebiliriz.
		//h ile başlayanları sil.
		stringTempList.removeIf(str -> str.startsWith("h"));
		
		stringTempList.forEach(System.out::println);
	}
}
