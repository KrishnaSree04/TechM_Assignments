package collections;
import java.util.*;
public class task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<Integer>();
     List<Integer> l1=new ArrayList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     l1.addAll(l);
    	 System.out.println("list 1 is"+l);
    	 System.out.println("copied list 2 is"+l1);
    	 
	}

}
