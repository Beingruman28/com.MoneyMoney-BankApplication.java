package bankapplication;

public abstract class CurrentAcc extends BankAcc{
private final float creditLimit =  1000;
	
	public CurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.getcreditLimit(creditLimit);
	}
	public float getcreditLimit(float creditLimit)
	{
		return creditLimit;
	}
	public float getCreditLimit()
	{
		return creditLimit;
	}
	public void withdraw(float amount) {
		System.out.println("your withdraw amount :"+amount);
	}
	public String toString() {
		return "this is a current Account";
	}	
}

