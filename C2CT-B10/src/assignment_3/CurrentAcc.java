package assignment_3;
public abstract class CurrentAcc extends BankAcc
{
    public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	final float creditLimit=50000;
//	@Override
//	public void withdraw(float accNm)
//	{
//		System.out.println("Welcome to withdraw and i'm inside CurrentAcc");
//	}
//	
//	@Override
//	public void deposit(float accNm)
//	{
//		System.out.println("Welcome to deposite and i'm inside SavingAcc");
//	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
