package Practice2;
import java.util.ArrayList;
public class ArrayListDemo2 
{
	public static void main(String[] args) 
    {
    	ArrayList a1=new ArrayList();
		a1.add(10.1);
		a1.add(18);
		a1.add("Hello");
		a1.add(101);
		a1.add('d');
		a1.add(10);
		a1.add(null);
		a1.add(15);
		a1.add("DBOSS");
		a1.add(17);
		a1.add('S');
		a1.add(111.123);
		System.out.println(a1);
		
		System.out.println("the Even values are");
		System.out.println("--------------------");
		for (int i = 0; i < a1.size(); i++) 
		{
			Object obj=a1.get(i);
			
			if(obj instanceof Integer)
			{
				Integer i1=(Integer)obj;
				if(i1 % 2 == 0)
				{
					System.out.println(i1);
				}
			}
		}
		System.out.println("the Odd values are");
		System.out.println("--------------------");
		for (int i = 0; i < a1.size(); i++) 
		{
			Object obj=a1.get(i);
			
			if(obj instanceof Integer)
			{
				Integer i2=(Integer)obj;
				if(i2 % 2 != 0)
				{
					System.out.println(i2);
				}
			}
		}
		System.out.println("the String values are");
		System.out.println("--------------------");
		for (int i = 0; i < a1.size(); i++) 
		{
			Object obj=a1.get(i);
			if(obj instanceof String)
			{
				System.out.println(a1.get(i));
			}
		}
		System.out.println("the Double values are");
		System.out.println("--------------------");
		for (int i = 0; i < a1.size(); i++) 
		{
			Object d=a1.get(i);
			if(d instanceof Double)
			{
				System.out.println(a1.get(i));
			}
		}
		System.out.println("the Character values are");
		System.out.println("--------------------");
		for (int i = 0; i < a1.size(); i++) 
		{
			Object c=a1.get(i);
			if(c instanceof Character)
			{
				System.out.println(a1.get(i));
			}
		}
	}
}
