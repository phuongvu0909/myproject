package Hw1_VuThiPhuong_18001176;

public class NormalAccount extends BankingAccount {

	public NormalAccount(float deposit, float withdraw) {
		super(deposit, withdraw);
	}

	@Override
	public String toString() {
		
		return "[ NormalAccount:deposit:" + deposit + "," + "withdraw:" + withdraw + "]";
	}
	
}
