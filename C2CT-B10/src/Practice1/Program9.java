package Practice1;
public class Program9 
{
	static void canVote(int age)
	{
		if(age<18)                                                                                     //no error
            try
		    {
                throw new Exception();
            }
		    catch(Exception e)
		    {
                System.out.println("you are not an adult!");
            }
		else
		   System.out.println("you can vote!");
	}
	public static void main (String[] args) 
	{
		canVote(20);
		canVote(10);
	}
}