package stream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Stream_1 {
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		List<String> words = Arrays.asList("hello", "world", "java", "streams");
		        
		        List<String> upperCaseWords = words.stream()
		                                           .map(String::toUpperCase)
		                                           .collect(Collectors.toList());
		        
		        List<String> lowerCaseWords = words.stream()
		                                           .map(String::toLowerCase)
		                                           .collect(Collectors.toList());
		        
		        System.out.println("Uppercase: " + upperCaseWords);
		        System.out.println("Lowercase: " + lowerCaseWords);
			}

		}
