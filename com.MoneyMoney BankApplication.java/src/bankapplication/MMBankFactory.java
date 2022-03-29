package bankapplication;

import org.junit.jupiter.api.Test;

public class MMBankFactory extends BankFactory{
	private int getMinbal=300;
	@Test
	public String  getNewSavingAcc (int accNo , String accNm , float accBal , boolean isSalaried)
	{
		return "Saving Account(Account Number :"+accNo+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Minimum Balance is :"+getMinbal+" | Is salary Account : "+isSalaried+")";

	}
	@Test
	public String  getNewCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		return "Current Account(Account Number :"+accNm+" | Account Name : "+accNm+" | Account Balance : "+accBal+" | Credit Limit Balance is :"+creditLimit+")";

	}

	public static void main(String[] args) {
		MMBankFactory mmf= new MMBankFactory();
		System.out.println(mmf.getNewCurrentAcc(123, "harbajan singh", 100000, 20000));
		System.out.println(mmf.getNewSavingAcc(122, "yuvraj singh", 2000, true));
		System.out.println(mmf.getNewCurrentAcc(121, "shreyas iyer", 4000, 20000));
		System.out.println(mmf.getNewSavingAcc(120, "surya k yadav", 70000, true));
		
	}

}