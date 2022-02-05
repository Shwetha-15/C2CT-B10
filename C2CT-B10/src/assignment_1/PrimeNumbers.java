package assignment_1;
import java.util.Scanner;
public class PrimeNumbers 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		boolean result=false;
	    for (int i = 2; i < num; i++) 
		{
			if(num % i == 0)
			{
				result= true;
				break;
			}
		}
	    if(!result)
	    {
	    	System.out.println(num +" is a prime number");
	    }
	    else 
	    {
	    	System.out.println(num +" is not a prime number");
	    }
	}
}
