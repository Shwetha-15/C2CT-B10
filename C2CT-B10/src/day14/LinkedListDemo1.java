//We can add any type of values to LL and we can print one by one also using for loop
package day14;
import java.util.LinkedList;
public class LinkedListDemo1 
{
    public static void main(String[] args) 
    {
    	LinkedList l=new LinkedList<>();
		l.add(15);
		l.add("Jai");
		l.add(1.56);
		l.add('S');
		l.add("DBOSS");
		l.add(15);
		l.add(15.16f);
		System.out.println("The elements in the linked list are "+l);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The elements in the linked list are ");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
}
