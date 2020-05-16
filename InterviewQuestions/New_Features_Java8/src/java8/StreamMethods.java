package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMethods {

	private static void printArray(List<String> list) {
		list.stream().forEach(System.out::println);
	}

	private static void countEmpythString(List<String> list) {

		long count = list.stream().filter(li -> li.isEmpty()).count();
		System.out.println("Total count of empty string " + count);

	}

	private static void countStringsLenghtMoreThan3(List<String> strList) {
		long count = strList.stream().filter(li -> li.length() > 3).count();
		System.out.println("Totat count of string lenght more than "+count);

	}

	private static void removeAllEmptyString(List<String> strList) {
		List<String> newList = strList.stream().filter(li -> !li.isEmpty()).collect(Collectors.toList());
		System.out.println("after remove all empty list " + newList);
	}

	private static void convertStringToUperCase(List<String> strList) {
		List<String> newList = strList.stream().map(li -> li.toUpperCase()).collect(Collectors.toList());
		System.out.println("convert string to upercase " + newList);
	}

	private static void createListOFSquareOfAllDistinctNumbers(List<Integer> numList) {
     List<Integer> newList = numList.stream().map(i-> i*i).distinct().collect(Collectors.toList());
     System.out.println("List OF Square Of All Distinct Numbers "+newList);
	}
	
	private static void getcountMinMaxSumAndAverage(List<Integer> numList) {
		//IntStream sum = numList.stream().mapToInt(i->i+i);
		IntSummaryStatistics  result = numList.stream().mapToInt(i->i).summaryStatistics();	
		
	System.out.println("Count "+result.getCount());
	System.out.println("Min "+result.getMin());
	System.out.println("Max "+result.getMax());
	System.out.println("Sum "+result.getSum());
	System.out.println("Average "+result.getAverage());
	}

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		printArray(strList);

		// Count the empty strings
		countEmpythString(strList);

		// Count String with length more than 3
		countStringsLenghtMoreThan3(strList);

		// Remove all empty Strings from List
		removeAllEmptyString(strList);

		// Convert String to Uppercase
		convertStringToUperCase(strList);

		List<Integer> numList = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		// Create List of square of all distinct numbers
		createListOFSquareOfAllDistinctNumbers(numList);
		
		//Get count, min, max, sum, and average for numbers

		getcountMinMaxSumAndAverage(numList);

	}

	

}
