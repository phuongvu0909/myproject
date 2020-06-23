package Hw1_VuThiPhuong_18001176;

public class BankingAccount {
	
	protected float deposit;
	protected float withdraw;
	protected String name;
	
	public BankingAccount() {
		
	}
	
	public BankingAccount(float deposit, float withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "BankingAccount [name=" + name + "]";
	}
}

