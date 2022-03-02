package day17;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day16.EmployeeDemo;
public class EqualsDemo3_Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<EqualsDemo3> l=new ArrayList<EqualsDemo3>();
		l.add(new EqualsDemo3("Shwetha", 1));
		l.add(new EqualsDemo3("Sumanth", 2));
		l.add(new EqualsDemo3("Kusuma", 3));
		l.add(new EqualsDemo3("Kantha", 4));
		System.out.println(l);
		
		for (int i = 0; i < l.size(); i++) 
		{
		     System.out.println(l.get(i));	
		}
		
		Iterator<EqualsDemo3> it=l.iterator();
		while(it.hasNext())
		{
			EqualsDemo3 ed=it.next();
			if(ed.getName().startsWith("s"))
			{
				System.out.println(ed);
			}
		}
	}

}
