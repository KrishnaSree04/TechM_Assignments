package collections;
import java.util.*;
public class task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     LinkedList<Integer> l=new LinkedList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     l.add(5);
     System.out.println("enter starting position index:");
     int n=sc.nextInt();
     for(int i=n;i<l.size();i++)
    	 System.out.print(l.get(i)+" ");
     
	}
    	 
     
	}

