package bankapplication;

public abstract class BankAcc {
	private int accNo;
    private String accNm;
    private float accBal;
   
    public BankAcc(int accNo , String accNm, float accBal)
    {
    	super();
    	this.setaccNo(accNo);
    	this.setaccNm(accNm);
    	this.setaccBal(accBal);
    }
   public  int getaccNo()
   {
	  return accNo ;
   }
   public void setaccNo(int accNo) {
	   this.accNo=accNo;
   }
   public  String getaccNm()
   {
	  return accNm ;
   }
   public void setaccNm(String accNm) {
	   this.accNm=accNm;
   }
   public  float getaccBal()
   {
	  return accBal ;
   }
   public void setaccBal(int accBal) {
	   this.setaccBal(accBal);
   }
   public float getAccBal()
   {
		return accBal;
	}
	public void setaccBal(float accBal) 
	{
		this.accBal = accBal;
	}
   public void withdraw(float amount) {
	   System.out.println(amount);
	}
   public void deposite(float dpamount) {
	   System.out.println(dpamount);
	}
	public String toString() {
		 return toString();
	}	
}
