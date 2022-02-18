package day9;
class Final
{
	public final void m1()
	{
		System.out.println("I am Inside m1");
	}
	public void m2()
	{
		System.out.println("I am Inside m2");
	}
}
public class FinalKeyword_Method extends Final
{
	/*public final void m1()
	{
		System.out.println("Overriding m1");
	}*/  //we can not override final method
	public final void m2()
	{
		System.out.println("Overriding m2");
	}
	public static void main(String[] args) 
	{
		FinalKeyword_Method f=new FinalKeyword_Method();
		f.m1();
		f.m2();
	}

}
