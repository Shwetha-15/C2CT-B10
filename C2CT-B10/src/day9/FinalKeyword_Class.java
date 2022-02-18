package day9;
final class FinalDemo
{
	public void m1()
	{
		System.out.println("I am Inside m1");
	}
}
class FinalDemo1
{
	public void m2()
	{
		System.out.println("I am Inside m2");
	}
}
public class FinalKeyword_Class extends FinalDemo1 //we can not extend final class
{    
	//we can not extend FinalDemo class
	/*public final void m1()
	{
		System.out.println("Overriding m1");
	}*/
	//we can extend FinalDemo1 class
	public void m2()
	{
		System.out.println("Overriding m2");
	}
	public static void main(String[] args) 
	{
		FinalKeyword_Class f=new FinalKeyword_Class();
		f.m2();
	}

}
