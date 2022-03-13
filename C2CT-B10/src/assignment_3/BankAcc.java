package assignment_3;
abstract public class BankAcc 
{
    private int accNo;
    private String accNm;
    private float accBal;
    
	public BankAcc(int accNo, String accNm, float accBal) 
	{
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
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

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
    abstract public void withdraw(float accNm);
    
    abstract public void deposit(float accNm);
   
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return ("accNo=" + accNo +"accNm=" + accNm + "accBal=" + accBal);
    }
}
