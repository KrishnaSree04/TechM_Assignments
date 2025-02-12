package collections;
import java.util.*;
public class task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     List<Integer> l=new ArrayList<Integer>();
     l.add(2);
     l.add(9);
     l.add(3);
     l.add(1);
     System.out.println(" enter element to be search");
     int n=sc.nextInt();
     int m=l.indexOf(n);
     if(m>=0 && m<l.size())
    	 System.out.print("element is fount at index:"+m);
     else
    	 System.out.println("element is not found");
    	 
     
	}

}
