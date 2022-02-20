package assignment_2;
import java.util.*;
public class ExceptionHandling_1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		try 
		{
			System.out.println(5/0);//Arithmetic Exception occurs in this line because we can not divide 5 by 0	
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("End of program!");
		System.out.println("Main ends");
	}

}
