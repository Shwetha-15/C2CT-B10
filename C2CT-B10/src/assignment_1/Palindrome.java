//WAP to check Palindrome
package assignment_1;
public class Palindrome 
{
	public static void main(String[] args) 
	{
         int num=515;
         if(isPalindrome(num))
         {
        	 System.out.println(num +" is a Palindrome");
         }
         else
         {
        	 System.out.println(num +" is not a Palindrome");
         }
	}
    public static boolean isPalindrome(int num)
    {
    	int rem,rev=0;
    	int temp=num;
    	while(num>0)
    	{
    		rem=num%10;
    		rev=rev*10+rem;
    		num=num/10;
    	}
    	return rev==temp;
    }
}
