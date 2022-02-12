package day5;
import java.io.*;
public class Addition 
{
   public static void main(String[] args) throws Exception 
   {
	    InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter two numbers");
		int x=Integer.parseInt(br.readLine());
		int y=Integer.parseInt(br.readLine());
	    int sum=x+y;
		System.out.println("sum = "+sum);
   }
}
