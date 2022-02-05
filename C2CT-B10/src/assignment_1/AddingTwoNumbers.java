//WAP for addtion of two numbers by asking input from the user
package assignment_1;
import java.util.Scanner;
public class AddingTwoNumbers 
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
