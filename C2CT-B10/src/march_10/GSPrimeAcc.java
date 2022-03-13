package march_10;

public class GSPrimeAcc extends PrimeAcc
{
	public GSPrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void bookProduct(float charges)
    {
    	System.out.println("Inside GSprime account");
    }
	
	@Override
	public void items(float charges) 
	{
		// TODO Auto-generated method stub
		System.out.println("Inside GSPrime account");
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
