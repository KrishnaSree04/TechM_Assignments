package collections;
import java.util.*;
public class task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     System.out.println("enter element to be inserted:");
     int n=sc.nextInt();
     System.out.println("enter index at which element to be inserted:");
     int m=sc.nextInt();
     System.out.println("original list is"+l);
     l.add(m,n);
     System.out.println("After inserted linked list is");
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.print(i.next()+" ");
     
	}
    	 
     
	}

}
