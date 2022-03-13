package march_10;

abstract public class NormalAcc extends ShoppAcc
{
	public NormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	final float deliveryCharge=8;
	
	@Override
    public void bookProduct(float charges)
    {
    	System.out.println("Inside Normal account");
    }
  
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
