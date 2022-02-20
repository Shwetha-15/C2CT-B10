package assignment_2;
public class ExceptionHandling_3 
{
	   	static void canVote(int age)
	   	{
	   	   if(age<18)
	   	   {
	           System.out.println("you are not an adult!");
	   	   }
	       else
	       {
	   		   System.out.println("you can vote!");
	       }
	   	}
	   	public static void main (String[] args) 
	   	{
	   		try {
	   			canVote(20);
		   		//canVote(10);
			} finally {
				// TODO: handle finally clause .
			}
	   	}
}
