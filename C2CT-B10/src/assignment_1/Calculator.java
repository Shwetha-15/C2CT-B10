//WAP for calculator taking input from the user
package assignment_1;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number ");
		int num1=sc.nextInt();
		System.out.println("Enter a second number ");
		int num2=sc.nextInt();
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1 :System.out.println("Sum = "+(num1+num2));
		        break;
		case 2 :System.out.println("Difference = "+(num1-num2));
                break;
		case 3 :System.out.println("Product = "+(num1*num2));
                break;
		case 4 :System.out.println("Quotient = "+(num1/num2));
                break;
		case 5 :System.out.println("Remainder = "+(num1%num2));
                break;
        default :System.out.println("Invalid choice");
		}
	}

}
