package day12;
public class ThrowDemo 
{
	void validate(int income)
	{
		if(income>5)
		{
			System.out.println("Not Eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}
    public static void main(String[] args)
	{
    	System.out.println("Main starts");
    	ThrowDemo t=new ThrowDemo();
    	t.validate(10);
        System.out.println("Main ends");
	}

}
