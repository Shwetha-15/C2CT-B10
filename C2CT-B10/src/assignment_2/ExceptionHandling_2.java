package assignment_2;
public class ExceptionHandling_2
{	
	public static void main (String[] args) 
	{
		int a=10;
		System.out.println("Main starts");
		try 
		{
			for(int i=3;i>=0;i--)
			{
			    System.out.println(a/i);//Arithmetic exception  
		    }		
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("Main ends");
	}

}
