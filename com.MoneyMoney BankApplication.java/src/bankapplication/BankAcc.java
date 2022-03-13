package bankapplication;

public abstract class BankAcc {
	private int accNo;
    private String accNm;
    private float accBal;
   
    public BankAcc(int accNo , String accNm, float accBal)
    {
    	super();
    	this.accNo = accNo;
    	this.accNm = accNm;
    	this.accBal = accBal;
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
   public void setaccBal(float accBal) {
	   this.accBal=accBal;
   }
   public void withdraw(float wd) {
	   withdraw (wd);
	}
   public void deposite(float dp) {
	   deposite (dp);
	}
	public String toString() {
		 return toString();
	}	
}
