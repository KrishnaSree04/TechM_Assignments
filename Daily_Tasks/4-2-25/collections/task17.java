package collections;
import java.util.*;
public class task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(3);
     l.add(4);
     l.add(5);
     l.addFirst(1);
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.print(i.next()+" ");
     
	}
    	 
     
	}

}
