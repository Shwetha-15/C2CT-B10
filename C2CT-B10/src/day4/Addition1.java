package day4;
import java.util.Scanner;
public class Addition1 
{
   public static void main(String[] args) 
   {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a first number ");
		int num1=sc.nextInt();
		System.out.println("Enter a second number ");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum = "+sum);
   }
}
