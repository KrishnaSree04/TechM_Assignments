package collections;
import java.util.*;
public class task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(3);
     l.add(4);
     l.add(5);
     l.addFirst(1);
     l.addLast(6);
     System.out.println("enter index at which elements to be inserted:");
     int m=sc.nextInt();
     System.out.println("enter element 1 to be inserted:");
     int n1=sc.nextInt();
     System.out.println("enter element 2 to be inserted:");
     int n2=sc.nextInt();
     System.out.println("original list is"+l);
     l.add(m,n1);
     l.add(m,n2);
     System.out.println("After inserted linked list is");
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
     {
    	 System.out.print(i.next()+" ");
     
	}
    	 
     
	}

}

