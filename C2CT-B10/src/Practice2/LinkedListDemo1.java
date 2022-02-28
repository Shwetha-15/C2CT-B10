package Practice2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        List l1=new LinkedList();
        l1.add(17);
		l1.add(15.25);
		l1.add(null);
		l1.add(15);
		l1.add('S');
		l1.add("Harshi");
		l1.add("DBOSS");
		l1.add(1);
		l1.add("Maharshi");
		l1.add(105);
		l1.add(null);
		l1.add("Vamshi");
		System.out.println(l1);
		System.out.println("Printing objects one by one");
		System.out.println("----------------------------");
		for (int i = 0; i < l1.size(); i++) 
		{
			System.out.println(l1.get(i));
		}
		System.out.println("Printing Integer objects");
		System.out.println("-------------------------");
		for (int i = 0; i < l1.size(); i++) 
		{
			Object obj=l1.get(i);
			if(obj instanceof Integer)
			{
				System.out.println(obj);
			}
		}
		System.out.println("Printing String objects whose name ends with rshi");
		System.out.println("-------------------------------------------------");
		for (int i = 0; i < l1.size(); i++) 
		{
			Object obj=l1.get(i);
			if (obj instanceof String) 
			{
				String s=(String)obj;
				if(s.endsWith("rshi"))
				{
					System.out.println(s);
				}
			}
		}
	}

}
