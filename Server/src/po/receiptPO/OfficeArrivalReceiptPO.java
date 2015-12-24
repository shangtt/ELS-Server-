package po.receiptPO;

import java.sql.Time;

public class OfficeArrivalReceiptPO extends ReceiptPO{
	//中转单编号？为ID
	private String Departure;
	private String TranState;
	
	public OfficeArrivalReceiptPO(TITLE title, String id, APPROVAL approval,Time date,String D,String T) {
		super(title, id, approval,date);
		this.Departure = D;
		this.TranState = T;
	}
	public String getDeparture(){
		return Departure;
	}
	public String getTranState(){
		return TranState;
	}
}