package collections;
import java.util.*;
public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(0,1);
     System.out.println(" enter index of an element to be retrieved");
     int n=sc.nextInt();
     if(n>=0 && n<l.size())
    	 System.out.print(l.get(n));
     else
    	 System.out.println("index is out of bounds");
    	 
     
	}

}
