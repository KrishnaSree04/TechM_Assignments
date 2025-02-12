package collections;
import java.util.*;
public class task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.print(i.next()+" ");
     
	}
    	 
     
	}

}
