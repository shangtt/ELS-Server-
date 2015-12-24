package po.receiptPO;

import java.sql.Time;

public class CentraArrivalReceiptPO extends ReceiptPO{
	private String centraCode;
	private String Departure;
	private String TranState;

	public CentraArrivalReceiptPO(TITLE title, String id, APPROVAL approval,String c,Time date,String D,String T) {
		super(title, id, approval,date);
		this.centraCode = c;
		this.Departure = D;
		this.TranState = T;
	}
	public String getCentreCode(){
		return centraCode;
	}
	public String getDeparture(){
		return Departure;
	}
	public String getTranState(){
		return TranState;
	}
}
