package bankapplication;

public class MMSavingAcc extends SavingAcc{
private static final float MINBAL = 0;
	
	public MMSavingAcc (int accNo , String accNm, float accBal ,boolean isSalaried) 
	{

		super(accNo,accNm,accBal,isSalaried);
		//MMSavingAcc.MINBAL = MINBAL;
	}
	
	public float getaccBal() {
		return MINBAL;
	}
	public void withdraw(float wd) {
		 super.withdraw(wd);
	}
	public String toString() {
		return super.toString();
	}		
	

}
