package day16;
import java.util.*;
public class ArrayListDemo1 
{
     public static void main(String[] args) 
     {
	     ArrayList a=new ArrayList();	
	     a.add("Shwetha");
		 a.add("Jai");
		 a.add("DBOSS");
		 a.add("Darshan");
		 a.add("Thoogudeepa");
		 System.out.println(a);
		 
		 System.out.println(a.size());
		 
		 System.out.println(a.isEmpty());
		 
		 System.out.println(a.contains("DBOSS"));
		 
		 System.out.println(a.indexOf("Shwetha"));
		 
		 System.out.println(a.lastIndexOf("Jai"));
		 
		 System.out.println(a.get(4));
		 
		 System.out.println(a.set(1, "Goutham"));
		 System.out.println(a);
		 
		 System.out.println(a.remove(4));
		 System.out.println(a);
	 }
}
