package bankapplication;

public class MMCurrentAcc extends CurrentAcc {
	
	public MMCurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		super(accNo,accNm,accBal,creditLimit);
	}
	
	public void withdraw(float amount) {
		if (amount>2000) {
			System.out.println("your credit limit is succeeded");
		}else {
		System.out.println("your withdraw amount :"+amount);
	}
	}
	public String toString() {
		return "Saving Account(Account Number :"+getaccNo()+" | Account Name : "+getaccNm()+" | Account Balance : "+getaccBal()+" | Credit Limit Balance is :"+getCreditLimit()+")";

	}

	public static void main(String[] args) {
		MMCurrentAcc mmc =new MMCurrentAcc(101, "ab delivers",5000, 10000);
		MMCurrentAcc mmc1 =new MMCurrentAcc(102, "faf",10000, 50000);
		mmc.withdraw(1000);
		mmc1.withdraw(15000);
		mmc1.withdraw(150000);
		System.out.println(mmc.toString());
		System.out.println(mmc1.toString());
	}

}