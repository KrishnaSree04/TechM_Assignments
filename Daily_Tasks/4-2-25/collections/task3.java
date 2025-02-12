package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(2);
     l.add(3);
     l.add(0,1);
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
    	 System.out.print(i.next()+" ");
     
	}

}
