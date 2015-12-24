package po.receiptPO;

import java.sql.Time;
import java.util.ArrayList;

public class LoadReceiptPO extends ReceiptPO{
	//汽运单号作为ID在父类中
	protected String Arrival;
	protected String OfficeCode;
	protected String TrunkCode;
	protected String NameOfSupervisor;
	protected String NameOfGuard;
	protected double ShippingFee;
	
	protected ArrayList<String> OrderID;
	public LoadReceiptPO(TITLE title, String id, APPROVAL approval,Time date,
			String A,String O,String T,String NS,String NG,double fee) {
		super(title, id, approval,date);
		this.Arrival = A;
		this.OfficeCode = O;
		this.TrunkCode = T;
		this.NameOfSupervisor = NS;
		this.NameOfGuard = NG;
		this.ShippingFee = fee;
	}
	public String getArrival(){
		return Arrival;
	}
	public String getOfficeCode(){
		return OfficeCode;
	}
	public String getTrunkCode(){
		return TrunkCode;
	}
	public String getNameOfSupervisor(){
		return NameOfSupervisor;
	}
	public String getNameOfGuard(){
		return NameOfGuard;
	}
	public double getShippingFee(){
		return ShippingFee;
	}
}