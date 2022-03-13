package assignment_3;

public class MMSavingAcc extends SavingAcc
{
	public MMSavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	public boolean isSalary() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void withdraw(float accNm)
	{
		System.out.println("Welcome to withdraw and i'm inside MMSavingAcc");
	}
	 
	@Override
	public void deposit(float accNm) 
	{
		// TODO Auto-generated method stub
		System.out.println("Welcome to deposit and i'm inside MMSavingAcc");
	}
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
}
