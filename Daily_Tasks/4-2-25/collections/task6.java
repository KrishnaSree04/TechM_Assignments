package collections;
import java.util.*;
public class task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(6);
     l.add(3);
     l.add(1);
     System.out.println("before removing list is:"+l);
     System.out.println("After removing third element");
     l.remove(2);
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
    	 System.out.print(i.next()+" ");
     
	}

}
