package bankapplication;

public abstract class BankFactory {
	public String  getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return  "new Saving Account";
	}
	
	public String  getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return "new Current Account";
	}

}
