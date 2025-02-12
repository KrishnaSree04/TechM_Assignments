package collections;
import java.util.*;
public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(4);
     l.add(3);
     l.add(8);
     System.out.println("enter element in array that need to change");
     int n=sc.nextInt();
     System.out.println("enter element that to be placed in array");
     int m=sc.nextInt();
     int g=l.indexOf(n);
     if(g>=0)
    	 l.set(g,m);
     Iterator<Integer> i=l.iterator();
     while(i.hasNext())
    	 System.out.print(i.next()+" ");
     
	}
	}

