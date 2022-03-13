package march_10;

abstract public class ShopFactory extends PrimeAcc
{
     public ShopFactory(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}
     
	abstract public PrimeAcc getNewPrimeAccount();
	
    abstract public NormalAcc getNewNormalAccount();
}
