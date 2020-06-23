package Hw1_VuThiPhuong_18001176;

public class SavingAccount extends BankingAccount {
	private float interest;
	private int term;
	
	public SavingAccount(float deposit,float withdraw,float interest,int term) {
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
	public float getWithdraw() {
		return (float)(deposit * Math.pow(1 + interest/100, term));
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ SavingAccount:deposit:" + deposit + ",interest:" + interest +
				",term:" + term + ",withdraw:" + getWithdraw() + "]";
	}
	
}
	
	

