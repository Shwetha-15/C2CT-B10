package day6;
import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
	     int num=sc.nextInt();
	     int rem;
	     int result=0;
	     int temp=num;
	     while(temp!=0)
			{
				rem=temp%10;
				result=result+rem*rem*rem;
				temp=temp/10;
			}
			if(result==num)
			{
				System.out.println(num +" is a armstrong number");
			}
			else
			{
				System.out.println(num +" is not a armstrong number");
			}
	}
}
