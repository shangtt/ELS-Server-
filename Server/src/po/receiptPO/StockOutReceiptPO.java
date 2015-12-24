package po.receiptPO;

import java.sql.Time;

public class StockOutReceiptPO extends ReceiptPO{
	private String arrival;
	private MODE mode;
	private String transCode;

	public StockOutReceiptPO(TITLE title, String id, APPROVAL approval,Time date,
			String arr,MODE mode,String code) {
		super(title, id, approval, date);
		this.arrival = arr;
		this.mode = mode;
		this.transCode = code;
	}
	public String getArrival(){
		return arrival;
	}
	public MODE getTransMode(){
		return mode;
	}
	public String getTransCode(){
		return transCode;
	}

}
