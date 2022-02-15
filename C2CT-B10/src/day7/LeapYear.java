package day7;
import java.io.*;
public class LeapYear 
{
   public static void main(String[] args) throws Exception 
   {
	   InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a year");
		int year=Integer.parseInt(br.readLine());
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
   }
}
