package assignment_3;
public class MMBankFactory extends BankFactory
{	
	@Override
	public SavingAcc getNewSavingAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount() {
		// TODO Auto-generated method stub
		return null;
	}   
	public static void main(String[] args) 
	{
	    MMBankFactory m=new MMBankFactory();
	    m.getNewCurrentAccount();
	    m.getNewSavingAccount();
	}
}
