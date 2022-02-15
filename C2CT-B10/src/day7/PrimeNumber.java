package day7;
import java.io.*;
public class PrimeNumber 
{
	public static void main(String[] args) throws Exception 
	{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int num=Integer.parseInt(br.readLine());
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
