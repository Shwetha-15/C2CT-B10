package assignment_3;
public class MMCurrentAcc extends CurrentAcc
{
	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(float accNm)
	{
		System.out.println("Welcome to withdraw and i'm inside MMCurrentAcc");
	}

	@Override
	public void deposit(float accNm) 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to deposit and i'm inside MMCurrentAcc");
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
}
