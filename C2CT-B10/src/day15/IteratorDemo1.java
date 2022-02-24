package day15;
import java.util.*;
public class IteratorDemo1 
{
     void Display(List<String> list)
     {
    	 Iterator<String> i=list.iterator();
    	 System.out.println("the elements are ");
    	 while(i.hasNext())
    	 {
    		 System.out.println(i.next());
    	 }
     }
     public static void main(String[] args) 
     {
	     List<String> l=new LinkedList<String>();
	     l.add("Shwetha");
	     l.add("Goutham");
	     l.add("Priya");
	     l.add("Viji");
	     l.add("kusuma");
	     l.add("Chida");
	     System.out.println(l);
	     
	     IteratorDemo1 id=new IteratorDemo1();
	     id.Display(l);
	 } 
}
