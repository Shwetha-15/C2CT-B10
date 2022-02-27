package Practice2;
import java.util.*;
public class ListDemo1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        List l=new ArrayList();
        l.add(15);
		l.add("Shwetha");
		l.add(12);
		l.add(null);
		l.add("D");
		l.add(16.25);
		l.add(15);
        System.out.println(l);
        System.out.println("-------------------------------------");
        System.out.println("Printing Integer Objects one by one");
		for (int i = 0; i < l.size(); i++) 
		{
			if(l.get(i) instanceof Integer)
			{
			    System.out.println(l.get(i));
			}
		}
	}

}
