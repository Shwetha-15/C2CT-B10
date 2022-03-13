package march_10;

abstract public class PrimeAcc extends ShoppAcc
{
    public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	public boolean isPrime;
   public void bookProduct(float charges)
   {
	   System.out.println("Inside prime account");
   }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
