//using Generics type we add only particular datatype objects. 
//In this we use string type Generics 
package day14;
import java.util.LinkedList;
public class LinkedListDemo2 
{
   public static void main(String[] args) 
   {
	   LinkedList<String> l=new LinkedList<>();
	   l.add("Shwetha");
	   l.add("Jai");
	   l.add("DBOSS");
	   l.add("Darshan");
	   l.add("Thoogudeepa");
	   System.out.println(l);
	   System.out.println("the elements in the linked list are");
	   for (int i = 0; i < l.size(); i++) 
	   {
		   System.out.println(l.get(i));
	   }
   }
}
