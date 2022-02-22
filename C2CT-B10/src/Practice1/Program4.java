package Practice1;
public class Program4 
{
    public static void main(String[] args) 
    {
    	try
    	{
            System.out.println(4/0);                                                                                  //no error
        }
    	catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
    	catch(Exception e)
        {
            System.out.println("Exception : divide by 0");
        }
	}
}
