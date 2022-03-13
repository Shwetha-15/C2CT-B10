package march_10;

public abstract class ShoppAcc 
{
    private int accNo;
    private String accNm;
    private float charges;
    
    public ShoppAcc(int accNo, String accNm, float charges) 
    {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
    
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	abstract public void bookProduct(float charges) ;
	
	abstract public void items(float charges);
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
