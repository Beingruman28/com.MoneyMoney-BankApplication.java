package bankapplication;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public  abstract class CurrentAcc extends BankAcc{
private final float creditLimit =  1000;
	
	public CurrentAcc (int accNo , String accNm, float accBal , float creditLimit)
	{
		super(accNo,accNm,accBal);
		this.getcreditLimit(creditLimit);
	}
	@Id
	@Column(name="accNo")
	int accNo;
	
	@Column(name="accNm")
	String accNm;
	
	@Column(name="accBal")
	static
	float accBal;
	
	@Column(name="creditlimit")
	float creditlimit;
	
	Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public void openAccount() {  
        System.out.print("Enter Account No: ");  
        accNo = sc.nextInt();  
        System.out.print("Enter Name: ");  
        accNm = sc.next();  
        System.out.print("Enter Balance: ");  
        accBal = sc.nextLong();  
    }  
    //method to display account details  
    public void showAccount() {  
        System.out.println("Name of account holder: " + accNm);  
        System.out.println("Account no.: " + accNo);  
        System.out.println("Balance: " + accBal);  
    }  
    //method to deposit money  
    public void deposit() {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        accBal = accBal + amt;  
    }  
    //method to withdraw money  
    public void withdrawal() {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (accBal >= amt) {  
        	accBal = accBal - amt;  
            System.out.println("Balance after withdrawal: " + accBal);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
	
	public float getcreditLimit(float creditLimit)
	{
		return creditLimit;
	}
	public float getCreditLimit()
	{
		return creditLimit;
	}
	public void withdraw(float amount) {
		System.out.println("your withdraw amount :"+amount);
	}
	public String toString() {
		return "this is a current Account";
	}	
}

