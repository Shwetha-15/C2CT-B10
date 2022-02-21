package assignment_2;
import java.util.*;
class Exception
{
	static void func(int a,int b)  
	{ 
		   int[] arr={1,2,3};
		   try 
		   {
			   System.out.println(10/a);
			   System.out.println(arr[b]);
		   }  
		   catch (ArrayIndexOutOfBoundsException e) 
		   {
			    // TODO: handle exception
			   System.out.println("Exception Handled");
		   }
    }
}
public class ExceptionDemo 
{
	public static void main (String[] args) throws ArithmeticException,NullPointerException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=in.nextInt();
		int b=in.nextInt();
		Exception.func(a, b);
		for(int i=0;i<3;i++)
		{
		    try
		    {
		    	Exception.func(in.nextInt(),in.nextInt());
    		}
		    catch(ArithmeticException e)
		    {
    		   System.out.println("can't divide by zero");
    		}
		    catch(ArrayIndexOutOfBoundsException e)
		    {
    		   System.out.println("Out of bounds!");
    		}
		 }
	}
}
