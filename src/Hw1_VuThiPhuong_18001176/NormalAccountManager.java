package Hw1_VuThiPhuong_18001176;

public class NormalAccountManager extends AccountManager{

	private float transfer;
	private String receivebank;
	private final int feeout = 8800;
	private final int feein = 1100;
	
	public NormalAccountManager(float deposit,float transfer,String receivebank,float withdraw) {
		super(deposit,withdraw);
		this.transfer = transfer;
		this.receivebank = receivebank;
	}

	public float getTransfer() {
		return transfer;
	}

	public void setTransfer(float transfer) {
		this.transfer = transfer;
	}
	
	public String getReceivebank() {
		return receivebank;
	}

	public void setReceivebank(String receivebank) {
		this.receivebank = receivebank;
	}

	@Override
	protected float withDraw() {
		if(receivebank.equals("in")) {
			return (deposit - transfer - feein);
		}
		else if(receivebank.equals("out")) {
			return (deposit - transfer - feeout);
		}
		return 0;
	}

	@Override
	public String toString() {
		
		return "NormalAccountManager: deposit:" + deposit + ",transfer:" + transfer
				+ ",receivebank:" + receivebank + ",withdraw:" + withDraw();
	}
	
	
}
