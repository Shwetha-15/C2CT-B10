package Practice1;
public class Program10 
{
     static void func(int a) throws Exception
     {
		   System.out.println(10/a);                                                 //no error
	 }
	 public static void main (String[] args) 
	 {
		try
		{
		    func(10);
		    func(0);
		}
		catch(Exception e)
		{
		   System.out.println("can't divide by zero");
		}
	
	 }
}
