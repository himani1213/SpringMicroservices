package java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String [] args) {
		/*testAnyMatchInteger();
		testAnyMatchString();
		testNoMatch();
		testMapToLong();
		testFindAny();
		testGenerate();*/
		/*testIterator();
		testMap();*/
		testPairSum();
	}
	public static void testPairSum() {
		List<Integer> list = Arrays.asList(20,30,80,70,30,40);
		Map<Integer,Integer> pairs = new HashMap<>();
		IntStream.range(0,list.size()).forEach(i ->{
			if(pairs.containsKey(list.get(i))) {
				if(pairs.get(list.get(i))!=null) {
					System.out.println("Pair found is "+ list.get(i)+", "+(100-list.get(i)));
				}
				pairs.put(100-list.get(i), null);
			}else if(!pairs.containsValue(list.get(i))) {
				pairs.put(100-list.get(i), list.get(i));
			}
		});
	}
	
	public static void testMap() {
		List<String> list = Arrays.asList("geeks","abs","hhjd");
		List<String> ans = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		ans.stream().forEach(System.out::println);
	}
	
	public static void testIterator() {
		IntStream stream = IntStream.of(1,3,5,7,8);
		Iterator<Integer> ans = stream.iterator();
		while(ans.hasNext()) {
			System.out.println(ans.next());
		}
	}
	
	public static void testGenerate() {
		IntStream stream = IntStream.generate(()->  (int)(Math.random()*10000));
		stream.limit(7).forEach(System.out::println);
	}
	
	public static void testFindAny() {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
		Optional<Integer> ans = list.stream().findAny();
		if(ans.isPresent()) {
			System.out.println(ans.get());
		}else {
			System.out.println("No value");
		}
	}
	
	public static void testMapToLong() {
		List<String> list = Arrays.asList("3","39","89","225","223");
		list.stream().mapToLong(num -> Long.parseLong(num)).filter(num-> Math.sqrt(num)/5==3).forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).flatMap(str->Stream.of(str.charAt(0))).forEach(System.out::println);
	}

	public static void testAnyMatchInteger() {
		List<Integer> list = Arrays.asList(3,4,6,7,8,20);
		boolean answer = list.stream().anyMatch(n -> (n*(n+1))/4 ==5);
		System.out.println(answer);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
	public static void testAnyMatchString() {
		List<String> list = Arrays.asList("Geeks","fOr","GEEKSQuiz","GeeksForGeeks");
		boolean answer = list.stream().anyMatch(str -> Character.isUpperCase(str.charAt(1)));
		System.out.println(answer);
	}
	public static void testNoMatch() {
		Stream<String> s = Stream.of("CSE","C++","IT","Java");
		boolean answer = s.noneMatch(str->(str.length()==4));
		System.out.println(answer);
	} 

}
