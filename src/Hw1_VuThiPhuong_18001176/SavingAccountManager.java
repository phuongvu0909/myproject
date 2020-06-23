package Hw1_VuThiPhuong_18001176;
public class SavingAccountManager extends AccountManager {
	private float interest;
	private int term;
	
	public SavingAccountManager(float deposit, float withdraw, float interest,int term) {
		super(deposit,withdraw);
		this.interest = interest;
		this.term = term;
	}
	
	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	@Override
	protected float withDraw() {
		return (float)(deposit * Math.pow(1 + interest/100, term));
	}

	@Override
	public String toString() {
		return "SavingAccount:deposit:" + deposit + ",interest:" + interest 
				+",term:" + term + ",withdraw:" + withDraw() ;
	}
}
	
//Todo we use AccountManager as a super class for other
// As BankingAccount.class, we have 2 options for consumers.
// We use this super class as abstract class for SavingAccountManager, NormalAccountManager
// We look the properties's BankingAccount to define the abstract & non abstract method needed for manage BankingAccount.
// Requirement
// - SavingAccountManager, we need calculate total the amount of interest and principal that users will receive in Withdraw
// - NormalAccountManager, we can transfer money between the Account.
// Remember !! AccountManager.class, we can
// - create,
// - remove
//