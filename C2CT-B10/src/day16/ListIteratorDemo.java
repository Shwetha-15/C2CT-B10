package day16;
import java.util.*;
public class ListIteratorDemo 
{
    public static void main(String[] args) 
    {
		List<EmployeeDemo> l=new ArrayList<>();
		l.add(new EmployeeDemo(001 ,"Shwetha",50000.00,"shwetha1234@gmail.com"));
		l.add(new EmployeeDemo(002 ,"Goutham",45000.00,"goutham08@gmail.com"));
		l.add(new EmployeeDemo(003 ,"Priya",38000.00,"priya18@gmail.com"));
		l.add(new EmployeeDemo(004 ,"Nithya",62000.00,"nithya17@gmail.com"));
		l.add(new EmployeeDemo(005 ,"DBOSS",100000.00,"darshan16@gmail.com"));
		
		//iterateListUsingListIterator(l);
		//addElementsInListUsingListIterator(l);
		//deleteElementsInListUsingListIterator(l);
		replaceElementsInListUsingListIterator(l);
	}
    private static void iterateListUsingListIterator(List<EmployeeDemo> l)
    {
    	 ListIterator<EmployeeDemo> li=l.listIterator();
    	 System.out.println("Forward direction");
    	 while(li.hasNext())
    	 {
    		 EmployeeDemo e=li.next();
    		 System.out.println(e);
    	 }
    	 System.out.println("Backward direction");
    	 while (li.hasPrevious()) 
    	 {
			EmployeeDemo e= (EmployeeDemo) li.previous();
			System.out.println(e);
		 }
    }
    
    private static void addElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(!e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	li.add(new EmployeeDemo(005 ,"Kusuma",20000.00,"kusuma14@gmail.com"));
   		    	break;
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
    
    private static void deleteElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	li.remove();
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
    
    private static void replaceElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	e.setName("kusuma Kantha");
   		    	li.set(e);
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
}
