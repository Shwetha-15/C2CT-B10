package assignment_2;
public class ExceptionHandling_3 
{
	   	static void canVote(int age) 
	   	{
	   	   if(age<18)
	   	   {
	   		   try 
	   		   {
	   			   throw new ArithmeticException();
	   	       }
	   		   catch (ArithmeticException e) 
	   		   {
			       // TODO: handle exception
	   			   System.out.println("you are not an adult!");
		       }
	   	   }
	   	   else
	       {
	   		   System.out.println("you can vote!");
	       }
	   	}
	   	public static void main (String[] args) 
	   	{
	        	canVote(20);
	   			canVote(10);
	   	}
}
