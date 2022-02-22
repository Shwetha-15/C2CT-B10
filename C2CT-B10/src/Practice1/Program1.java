package Practice1;
import java.util.*;
public class Program1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        try 
        {
        	System.out.println(5/0); 
		} 
        catch (Exception e) 
        {
			// TODO: handle exception
        	System.out.println("Exception handled");
        	System.out.println("End of program!");
		}
	}

}
