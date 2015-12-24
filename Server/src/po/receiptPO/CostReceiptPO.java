package po.receiptPO;

import java.sql.Time;

public class CostReceiptPO extends ReceiptPO{
	private double amount;
	private String operator;
	private String account;
	private String item;    //rent/shipping fee/salary/award
	private String ps;		//rentyear/transReceiptID/salarymonth

	public CostReceiptPO(TITLE title, String id, APPROVAL approval, Time date,
			double am,String op,String ac,String it,String ps) {
		super(title, id, approval, date);
		this.amount = am;
		this.operator = op;
		this.account = ac;
		this.item = it;
		this.ps = ps;
	}
	public double getAmount(){
		return amount;
	}
	public String getAccount(){
		return account;
	}
	public String getOPerator(){
		return operator;
	}
	public String getItem(){
		return item;
	}
	public String getPS(){
		return ps;
	}

}
