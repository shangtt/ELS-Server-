package po.receiptPO;

import java.sql.Time;
import java.util.ArrayList;

public class DeliverReceiptPO extends ReceiptPO{
	private String NameOfCourier;
	private ArrayList<String> OrderID;

	public DeliverReceiptPO(TITLE title, String id, APPROVAL approval,Time date,String N,ArrayList<String> orderid) {
		super(title, id, approval,date);
		this.NameOfCourier = N;
		this.OrderID = orderid;
	}
	public String getNameOfCourier(){
		return NameOfCourier;
	}
	public ArrayList<String> getOrderList(){
		return OrderID;
	}
	
}