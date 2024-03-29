package com.hkdemircan._09.parallelStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ParallelStreamTest01 {

	public static void main(String[] args) {

		Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream();
		Stream<Integer> parallelStream = stream.parallel();

		System.out.println(parallelStream.count());
	}

}
