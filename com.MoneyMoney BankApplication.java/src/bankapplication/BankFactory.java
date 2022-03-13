package bankapplication;

public abstract class BankFactory {
	public SavingAcc getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return null;
	}
	
	public CurrentAcc getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return null;
	}

}
