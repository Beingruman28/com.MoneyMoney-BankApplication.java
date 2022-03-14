package bankapplication;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried ;
	private static final float MINBAL = 500;
	
	public SavingAcc (int accNo , String accNm, float accBal , boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		this.setSalaried(isSalaried);
	}
	public boolean getisSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getdMINBAL() {
		return MINBAL;
	}
	public void withdraw(float amount) {
		System.out.println("withdraw amount :"+amount);
	}
	public String toString() {
	 return "saving acount";
	}	
}

