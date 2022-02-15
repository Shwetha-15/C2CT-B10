package day7;
import java.io.*;
public class Palindrome 
{
    public static void main(String[] args) throws Exception 
    {
    	InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int num=Integer.parseInt(br.readLine());
		int rem,rev=0;
     	int temp=num;
     	while(num!=0)
     	{
     		rem=num%10;
     		rev=rev*10+rem;
     		num=num/10;
     	}
         if(temp==rev)
         {
        	 System.out.println(temp +" is a Palindrome");
         }
         else
         {
        	 System.out.println(temp +" is not a Palindrome");
         }
	}
}
