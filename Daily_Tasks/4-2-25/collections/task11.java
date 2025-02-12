package collections;
import java.util.*;
public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     System.out.println("enter element to be added at last");
     int n=sc.nextInt();
     System.out.println("original list is"+l);
     l.addLast(n);
    	 System.out.println("updated linked list is"+l);
    	 
     
	}

}
