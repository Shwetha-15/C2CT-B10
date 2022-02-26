package day16;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EmployeeMain 
{
    public static void main(String[] args) 
    {
		List<EmployeeDemo> l=new ArrayList<EmployeeDemo>();
		l.add(new EmployeeDemo(001 ,"Shwetha",50000.00,"shwetha1234@gmail.com"));
		l.add(new EmployeeDemo(002 ,"Goutham",45000.00,"goutham08@gmail.com"));
		l.add(new EmployeeDemo(003 ,"Priya",38000.00,"priya18@gmail.com"));
		l.add(new EmployeeDemo(004 ,"Nithya",62000.00,"nithya17@gmail.com"));
		l.add(new EmployeeDemo(005 ,"DBOSS",100000.00,"darshan16@gmail.com"));
		
		Iterator<EmployeeDemo> it=l.iterator();
		while(it.hasNext())
		{
			EmployeeDemo ed=it.next();
			if(ed.getSalary()<=40000.00)
			{
				it.remove();
			}
		}
		
		Iterator<EmployeeDemo> it2=l.iterator();
		while(it2.hasNext())
		{
			EmployeeDemo ed=it2.next();
			System.out.println(ed);
		}
		System.out.println("-------------------------------");
		Iterator<EmployeeDemo> it3=l.iterator();
		it3.forEachRemaining(System.out::print);
	}
}
