package Practice1;
public class Program2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		for(int i=3;i>=0;i--)
		try
		{
		     System.out.println(a/i);                                          //error
		}
		catch(ArithmeticException e)
		{
		       System.out.println(e);
		}
	}

}
