package bankapplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MMSavingAcc extends SavingAcc{
private static final float MINBAL = 500;
	
	public MMSavingAcc (int accNo , String accNm, float accBal ,boolean isSalaried) 
	{

		super(accNo,accNm,accBal,isSalaried);
		//MMSavingAcc.MINBAL = MINBAL;
		//private String getisSalaried;
	}
	
	public float getaccBal() {
		return MINBAL;
	}
	public void withdraw(float amount) {
		if(amount<500) {
			System.out.println("you cant withdraw amount you dont have minimum balance");
		}else {
		System.out.println("withdraw amount :"+amount);
		}
	}
	public String toString() {
		return "Saving Account(Account Number :"+getaccNo()+" | Account Name : "+getaccNm()+" | Account Balance : "+getaccBal()+" | Minimum Balance is :"+getdMINBAL()+" | Is salary Account : "+getisSalaried()+")";
		
	}	
	public static void main(String[] args) { 
		MMSavingAcc mms = new MMSavingAcc(111, "RUMAN", 45,true);
		MMSavingAcc mms1 = new MMSavingAcc(222, "Mohammed", 50,false);
		MMSavingAcc mms2 = new MMSavingAcc(333, "ahad", 60,true);
		mms.toString();
		System.out.println("welcome to saving account");
		mms.withdraw(1000);
		mms.withdraw(500);
		
		System.out.println(mms.toString());
		System.out.println(mms1.toString());
		System.out.println(mms2.toString());
		System.out.println("Thank You");
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				//.addAnnotatedClass(BankAcc.class)
				.addAnnotatedClass(SavingAcc.class)
				.buildSessionFactory();
		
		Session session =factory.getCurrentSession();
		
		try {
			
			//create object of entity class type 
		     // BankAcc user = new BankAcc();
			SavingAcc user = new SavingAcc(40,"sreyas iyer",97222,true);
			
			//start transaction
			session.beginTransaction();
	
			
			
			//Perform operation
		     session.save(user);
			//BankAcc user = session.get(BankAcc.class,123);
			
			//Updating object
			//user.set("human");
			
			//deleting object
		    session.delete(user);

		    //commit the transaction 
			session.getTransaction().commit();
			System.out.println(user);
	
		}finally {
			session.close();
			factory.close();
	
	}

}
}