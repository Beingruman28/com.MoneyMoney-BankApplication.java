package bankapplication;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final float MINBAL = 0;
	
	public SavingAcc (int accNo , String accNm, float accBal , boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		this.isSalaried = isSalaried;
	}
	public boolean getisSalaried() {
		return isSalaried;
	}
	public float getdMINBAL() {
		return MINBAL;
	}
	public void withdraw(float wd) {
		 super.withdraw(wd);
	}
	public String toString() {
		return super.toString();
	}	
}

