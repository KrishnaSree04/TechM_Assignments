package collections;
import java.util.*;
public class task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     System.out.println("original list is"+l);
     System.out.println("reversed linked list is");
     Iterator<Integer> i=l.descendingIterator();
     while(i.hasNext())
     {
    	 System.out.print(i.next()+" ");
     
	}
    	 
     
	}

}
