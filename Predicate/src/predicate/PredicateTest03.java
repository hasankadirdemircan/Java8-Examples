package predicate;

import java.util.function.Predicate;

public class PredicateTest03 {

	public static void main(String[] args) {
		//kontrol predicate
		Predicate<String> nullCheckPredicate = e -> e != null;
		Predicate<String> lengthCheckPredicate = e -> e.length() > 2;
		
		// iki predicate birlestirdik.
		Predicate<String> andPredicate = nullCheckPredicate.and(lengthCheckPredicate);
		
		String temp1 = null;
		String temp2 = "java8";
		String temp3 = "hasan";
		String temp4 = "kadir";
		String temp5 = "demircan";
		String temp6 = "iki";
		
		// boolean test(T t);
		// predicate'e göre true/false dönecektir.
		System.out.println(andPredicate.test(temp1));
		System.out.println(andPredicate.test(temp2));
		System.out.println(andPredicate.test(temp3));
		System.out.println(andPredicate.test(temp4));
		System.out.println(andPredicate.test(temp5));
		System.out.println(andPredicate.test(temp6));

	}
}
