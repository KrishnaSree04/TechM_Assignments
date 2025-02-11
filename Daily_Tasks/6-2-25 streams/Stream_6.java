package stream;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Stream_6 {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(100, 20, 30, 400, 50);
	        
	        OptionalDouble average = numbers.stream()
	                                       .mapToInt(Integer::intValue)
	                                       .average();
	        
	        if (average.isPresent()) {
	            System.out.println("Average: " + average.getAsDouble());
	        } else {
	            System.out.println("List is empty, no average calculated.");
	        }
	    }
}
