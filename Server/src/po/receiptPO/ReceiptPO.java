package po.receiptPO;

import java.sql.Time;

enum APPROVAL {
	DRAFT, SUBMITTED, APPROVED
}

enum TITLE {
	MailReceipt, CollectReceipt, LoadReceipt, OfficeArrivalReceipt, DeliverReceipt, 
	CentraArrivalReceipt, TransferReceipt, StockInReceipt, StockOutreceipt, CostReceipt
}

public class ReceiptPO {
	public String id;
	public TITLE title;
	public Time Date;
	public APPROVAL approval;

	public ReceiptPO(TITLE title, String id, APPROVAL approval,Time date) {
		this.id = id;
		this.title = title;// type
		this.Date = date;
		this.approval = approval;
	}

	public String getID() {
		return id;
	}

	public TITLE getTitle() {
		return title;
	}
	
	public Time getDate(){
		return Date;
	}

	public APPROVAL getApproval() {
		return approval;
	}
}

