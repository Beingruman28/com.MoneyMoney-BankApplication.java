package bankapplication;

import java.util.Scanner;

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
		 Scanner sc = new Scanner(System.in);  
	        //create initial accounts  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        BankAcc C[] = new BankAcc[n];  
	        for (int i = 0; i < C.length; i++) {  
	            //C[i] = new BankAcc();  
	           // C[i].openAccount();  
	        }  
	        // loop runs until number 5 is not pressed to exit  
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter account no. you want to search: ");  
	                        int accNo = sc.nextInt();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(accNo);  
	                            if (found) {  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account no. : ");  
	                        accNo = sc.nextInt();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(accNo);  
	                            if (found) {  
	                                C[i].deposit(accBal);  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account No : ");  
	                        accNo = sc.nextInt();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(accNo);  
	                            if (found) {  
	                                C[i].withdraw(accBal);  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 5:  
	                        System.out.println("See you soon...");  
	                        break;  
	                }  
	            }  
	            while (ch != 5);  
	        sc.close();
	        }  
	    }  

