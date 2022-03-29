package bankapplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

import org.junit.jupiter.api.Test;

@Entity
@Table(name="bank")
public abstract class BankAcc {
		
			
		 public BankAcc(int accNo , String accNm, float accBal)
	    {
	    	super();
	    	this.setAccNo(accNo);
	    	this.setAccNm(accNm);
	    	this.setAccBal(accBal);
	    }
	    
	
	@Id
	@Column(name="accNo",nullable=false)
	private int accNo;
		
	
	@Column(name="accNm")
    private String accNm;
	
	@Column(name="accBal")
    private float accBal;
   
	//method to search an account number  
    public boolean search(int acc_no) {  
        if (accNo==acc_no) {  
            showAccount();  
            return (true);  
        }  
        return (false);  
    }  
   
    public void showAccount() {  
        System.out.println("Name of account holder: " + accNm);  
        System.out.println("Account no.: " + accNo);  
        System.out.println("Balance: " + accBal);  
    }  

	@Test
   public  int getaccNo()
   {
	  return getAccNo() ;
   }
	
   public void setaccNo(int accNo) {
	   this.setAccNo(accNo);
   }
   @Test
   public  String getaccNm()
   {
	  return getAccNm() ;
   }
   
   public void setaccNm(String accNm) {
	   this.setAccNm(accNm);
   }
   @Test
   public  float getaccBal()
   {
	  return getAccBal() ;
   }
   
   public void setaccBal(int accBal) {
	   this.setaccBal(accBal);
   }
   @Test
   public float getAccBal()
   {
		return accBal;
	}
   
	public void setaccBal(float accBal) 
	{
		this.setAccBal(accBal);
	}
	@Test
   public void withdraw(float amount) {
	   System.out.println(amount);
	}
   public void deposit(float dpamount) {
	   System.out.println(dpamount);
	}
   
   @Test
	public String toString() {
		return "BankAcc(Account No: "+ getaccNo() +"Balance: "+getaccBal()+" Account Name : "+getaccNm()+")";
	}
   public void openAccount(int accNo) {
		// TODO Auto-generated method stub
	   System.out.println(accNo);
	}

public int getAccNo() {
	return accNo;
}

public void setAccNo(int accNo) {
	this.accNo = accNo;
}

public String getAccNm() {
	return accNm;
}

public void setAccNm(String accNm) {
	this.accNm = accNm;
}

public void setAccBal(float accBal) {
	this.accBal = accBal;
}


}
