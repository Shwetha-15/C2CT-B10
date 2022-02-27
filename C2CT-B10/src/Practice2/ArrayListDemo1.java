package Practice2;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo1 
{
     public static void main(String[] args) 
     {
		  ArrayList a=new ArrayList();
		  a.add(15);
		  a.add("Shwetha");
		  a.add(12.34f);
		  a.add(null);
		  a.add("D");
		  a.add(16.25);
		  a.add(15);
		  System.out.println(a);
		  System.out.println("Printing elements one by one");
		  System.out.println("------------------------------");
		  for (int i = 0; i < a.size(); i++) 
		  {
			  System.out.println(a.get(i));
		  }
	 }
}
