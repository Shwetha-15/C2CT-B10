//WAP to check whether a character is vowel or consonant
package assignment_1;
public class VowelOrCosonant 
{
     public static void main(String[] args) 
     {
		char ch='S';
		 if(ch=='A' | ch=='E' | ch=='I' | ch=='O' | ch=='U' | 
		    ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u')
		    {
		    	System.out.println(ch+" is a vowel");
		    }
		    else
		    {
		    	System.out.println(ch+ " is a consonant");
		    }
	 }
}
