package assignment_3;

abstract public class SavingAcc extends BankAcc
{
	public SavingAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}

	public boolean isSalary=true;
    
	@Override
	public void withdraw(float accNm)
	{
		System.out.println("Welcome to withdraw and i'm inside SavingAcc");
	}
	
	@Override
	public void deposit(float accNm)
	{
		System.out.println("Welcome to deposite and i'm inside SavingAcc");
	}
	
	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
}
