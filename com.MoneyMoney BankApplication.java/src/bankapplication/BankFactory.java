package bankapplication;

import org.junit.jupiter.api.Test;

public abstract class BankFactory {
	@Test
	public String  getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return  "new Saving Account";
	}
	@Test
	public String  getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return "new Current Account";
	}

}
