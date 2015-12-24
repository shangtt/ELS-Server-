package po.receiptPO;

import java.sql.Time;
import java.util.ArrayList;

public class CollectReceiptPO extends ReceiptPO {
	//收款单编号作为ID在父类中
	private double Amount;
	private String NameOfCourier;
	private ArrayList<String> OrderID;

	public CollectReceiptPO(TITLE title, String id, APPROVAL approval,Time date,double A,String N,ArrayList<String> orderid) {
		super(title, id, approval,date);
		this.Amount = A;
		this.NameOfCourier = N;
		this.OrderID = orderid;
	}
	public double getAmount(){
		return Amount;
	}
	public String getNameOfCourier(){
		return NameOfCourier;
	}
	public ArrayList<String> getOrderList(){
		return OrderID;
	}//是否违反了信息隐藏中原则？
}