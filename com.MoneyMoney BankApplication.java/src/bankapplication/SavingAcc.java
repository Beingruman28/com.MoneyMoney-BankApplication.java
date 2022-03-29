package bankapplication;

import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried ;
	private static final float MINBAL = 500;
	
	public SavingAcc (int accNo , String accNm, float accBal , boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		this.setSalaried(isSalaried);
	}
	
	 Scanner sc = new Scanner(System.in);  
	    //method to open new account  
	    public void openAccount() {  
	        System.out.print("Enter Account No: ");  
	        setaccNo(sc.nextInt());  
	        System.out.print("Enter Name: ");  
	        setaccNm(sc.next());  
	        System.out.print("Enter Balance: ");  
	        setaccBal(sc.nextLong());  
	    }  
	    //method to display account details  
	    public void showAccount() {  
	        System.out.println("Name of account holder: " + getaccNm());  
	        System.out.println("Account no.: " + getaccNo()); 
	        System.out.println("Balance: " + getaccBal());  
	    }  
	    //method to deposit money  
	    public void deposit() {  
	        long amt;  
	        System.out.println("Enter the amount you want to deposit: ");  
	        amt = sc.nextLong();  
	        setaccBal(getAccBal() + amt);  
	    }  
	    //method to withdraw money  
	    public void withdrawal() {  
	        long amt;  
	        System.out.println("Enter the amount you want to withdraw: ");  
	        amt = sc.nextLong();  
	        if (getAccBal() >= amt) {  
	        	setaccBal(getAccBal() - amt);  
	            System.out.println("Balance after withdrawal: " + getAccBal());  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
	        }  
	    }  
	public boolean getisSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getdMINBAL() {
		return MINBAL;
	}
	public void withdraw(float amount) {
		System.out.println("withdraw amount :"+amount);
	}
	public String toString() {
	 return "saving account";
	}	
}

