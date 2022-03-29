package banking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank")
public class BankUsers {
	
	
	
	public BankUsers(int accno, String accname, int accbal) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.accbal = accbal;
	}

	@Id
	@Column(name="accno")
	int accno;
	
	@Column(name="accname")
	String accname;
	
	@Column(name="accbal")
	int accbal;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public int getAccbal() {
		return accbal;
	}

	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}
	

}
