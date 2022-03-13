package march_10;

public class GSNormalAcc extends NormalAcc
{
	public GSNormalAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void bookProduct(float charges)
    {
    	System.out.println("Inside GSnormal account");
    }
	
	@Override
	public void items(float charges) {
		// TODO Auto-generated method stub
		System.out.println("Inside GSNormal account");
	}
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
}
