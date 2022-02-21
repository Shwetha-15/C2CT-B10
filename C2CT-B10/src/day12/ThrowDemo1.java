package day12;

public class ThrowDemo1 
{
    static void validate(int income)
    {
    	try 
    	{
    		if(income>5)
    		{
    			throw new ArithmeticException("Not Eligible");
    		}
    		else
    		{
    			System.out.println("Eligible");
    		}
		}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
    		System.out.println("you are not eligible");
		}
    }
	public static void main(String[] args) 
	{
		System.out.println("Main starts");
		validate(10);
		System.out.println("Main ends");
	}
}
