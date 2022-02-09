//inheritance
package javaPrograms;
public class Program3 extends A
{
    int a=2;
    int b=3;
    int c;
    void sum()
    {
    	c=a+b;
    	System.out.println("result = "+c);
    }
    void multiplication(int a,double d)
    {
    	System.out.println("Multiplication result = "+(a*d));
    	System.out.println("hello child");
    }
    void display()
    {
    	System.out.println("hello child");
    }
    public static void main(String[] args) 
    {
		Program3 P3=new Program3();
		P3.sum();
		P3.multiplication(2, 1.5);
	}
}
class A
{
	void multiplication(int a,double d)
    {
    	System.out.println("Multiplication main result = "+(a*d));
    	System.out.println("hello child");
    }
	void display()
    {
    	System.out.println("hello parent");
    }
}
