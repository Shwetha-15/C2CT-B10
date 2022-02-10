package day3;
public class InheritanceUsedForOverridingPolymorphismDemo 
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
    	InheritanceUsedForOverridingPolymorphismDemo i=new InheritanceUsedForOverridingPolymorphismDemo();
		i.sum();
		i.multiplication(2, 1.5);
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
