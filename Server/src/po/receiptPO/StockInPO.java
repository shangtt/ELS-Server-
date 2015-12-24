package po.receiptPO;

import java.sql.Time;

public class StockInPO extends ReceiptPO{
	//快递编号即其ID
	private String arrival;
	private int strict;
	private int row;
	private int shelf;
	private int seat;

	public StockInPO(TITLE title, String id, APPROVAL approval, Time date,
			String a,int Queue1,int Queue2,int Queue3,int Queue4) {
		super(title, id, approval, date);
		this.arrival = a;
		this.strict = Queue1;
		this.row = Queue2;
		this.shelf = Queue3;
		this.seat = Queue4;
	}
	public String getArrival(){
		return arrival;
	}
	public String getQueue(){
		return strict+"区"+row+"排"+shelf+"架"+seat+"位";
	}
}
