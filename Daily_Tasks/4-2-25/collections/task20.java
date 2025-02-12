package collections;
import java.util.*;
public class task20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(3);
     l.add(4);
     l.add(5);
     l.addFirst(1);
     l.addLast(2);
     System.out.println("enter element to find first and last occurance");
     int n=sc.nextInt();
     System.out.println("first occurrence of element is "+l.indexOf(n));
     System.out.println("last occurrence of element is "+l.lastIndexOf(n));
     
    	 
     
	}

}
