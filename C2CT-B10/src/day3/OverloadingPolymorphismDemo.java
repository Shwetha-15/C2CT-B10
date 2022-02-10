package day3;
public class OverloadingPolymorphismDemo 
{
	void addition(int a,int b,int c)
	{
		System.out.println("result = "+(a+b+c));
	}
	void addition(int a,int b,double c)
	{
		System.out.println("result = "+(a+b+c));
	}
	void addition(int a,int b,int c,int d)
	{
		System.out.println("result = "+(a+b+c+d));
	}
	void addition(int a,int b)
	{
		System.out.println("result = "+(a+b));
	}
    public static void main(String[] args)
    {
    	OverloadingPolymorphismDemo o=new OverloadingPolymorphismDemo();
	    o.addition(2, 5);//int,int
	    o.addition(2, 4,1,5);//int,int,int,int
	    o.addition(1,2,3);//int,int,int
	    o.addition(2,8, 5.6);//int,int,double
    }
}
