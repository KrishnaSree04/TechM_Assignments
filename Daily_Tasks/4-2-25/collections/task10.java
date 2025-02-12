package collections;
import java.util.*;
public class task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(5);
     l.add(3);
     l.add(1);
     l.add(4);
     Collections.sort(l);
    	 System.out.println("list is"+l);
    Collections.shuffle(l);
    System.out.println("shuffled list is"+l);
     
	}

}
