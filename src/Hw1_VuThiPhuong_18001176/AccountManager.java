package Hw1_VuThiPhuong_18001176;

public abstract class AccountManager {
	
	protected String nameManager;
	protected float deposit;
	protected float withdraw;
	
	protected abstract float withDraw();
	
	public AccountManager() {
		
	}
	public AccountManager(float deposit, float withdraw) {
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	public String getNameManager() {
		return nameManager;
	}
	
	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
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

	@Override
	public String toString() {
		return "AccountManager [nameManager=" + nameManager + "]";
	}
}


