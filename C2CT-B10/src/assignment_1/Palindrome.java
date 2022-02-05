//WAP to check Palindrome
package assignment_1;
public class Palindrome 
{
	public static void main(String[] args) 
	{
        int num=515;
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
