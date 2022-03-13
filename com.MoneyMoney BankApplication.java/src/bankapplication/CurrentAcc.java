package bankapplication;

public abstract class CurrentAcc extends BankAcc{
private final float creditLimit;
	
	public CurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.creditLimit =creditLimit;
	}
	public float getcreditLimit() {
		return creditLimit;
	}
	public void withdraw(float wd) {
		super.withdraw(wd);
	}
	public String toString() {
		return super.toString();
	}	
}

