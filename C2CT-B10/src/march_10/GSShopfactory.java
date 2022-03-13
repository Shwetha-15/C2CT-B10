package march_10;

public class GSShopfactory extends ShopFactory
{
public GSShopfactory(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	public GSShopfactory() {
	// TODO Auto-generated constructor stub
    }

	@Override
	public PrimeAcc getNewPrimeAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) 
	 {
		GSShopfactory shop=new GSShopfactory();
		shop.getAccNm();
		shop.getAccNo();
		shop.getCharges();
		shop.getNewNormalAccount();
		shop.getNewPrimeAccount();
		shop.bookProduct(1.15f);
		shop.items(10);
		shop.toString();
	 }

	@Override
	public void items(float charges) {
		// TODO Auto-generated method stub
		
	}
}
