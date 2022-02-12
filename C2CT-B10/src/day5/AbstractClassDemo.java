package day5;
abstract class Vehicle
{
	int a;
	int b;
	abstract void m1();
	void m2()
	{
		
	}
	public class Activa extends Vehicle
	{
		void m1()
		{
			
		}
	}
}
public class AbstractClassDemo 
{
    public static void main(String[] args) 
    {
		//Vehicle v=new Vehicle();
    	Activa a=new Activa();
    	a.m1();
    	a.m2();
	}
}
