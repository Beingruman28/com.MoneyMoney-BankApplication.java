package banking1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bankapplication.BankAcc;

import banking.BankUsers;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SessionFactory factory = new Configuration()
					.configure("hibernate.cfg.xml")
					//.addAnnotatedClass(BankAcc.class)
					.addAnnotatedClass(BankAcc.class)
					.buildSessionFactory();
			
			Session session =factory.getCurrentSession();
			
			try {
				
				//create object of entity class type 
			     // BankAcc user = new BankAcc();
			      BankAcc user = new BankAcc(40,"sreyas iyer",97222);
				
				//start transaction
				session.beginTransaction();
		
				
				
				//Perform operation
			     session.save(user);
				//BankAcc user = session.get(BankAcc.class,123);
				
				//Updating object
				//user.set("human");
				
				//deleting object
				//session.delete(user);
				//commit the transaction 
				session.getTransaction().commit();
				//System.out.println(user);
				System.out.println(user);
			}finally {
				session.close();
				factory.close();
		
			}

		}



	}
