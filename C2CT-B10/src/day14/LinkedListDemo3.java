//Integer type Generics
package day14;
import java.util.LinkedList;
public class LinkedListDemo3 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		   l.add(15);
		   l.add(07);
		   l.add(1998);
		   l.add(16);
		   l.add(25);
		   System.out.println(l);
		   System.out.println("the elements in the linked list are");
		   for (int i = 0; i < l.size(); i++) 
		   {
			   System.out.println(l.get(i));
		   }
	}

}
