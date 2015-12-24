package po.receiptPO;

import java.sql.Time;
import java.util.ArrayList;

enum MODE{Airplane,Railway,Road}

public class TransferReceiptPO extends ReceiptPO{
	private MODE mode;
	private String flight;
	private String departure;
	private String arrival;
	private String container;
	private String supervisor;
	private ArrayList<String> OrderID;
	private double fee;

	public TransferReceiptPO(TITLE title, String id, APPROVAL approval,Time date,
			MODE m,String f,String D,String A,String C,String S,ArrayList<String> orderid,double fee) {
		super(title, id, approval, date);
		this.mode = m;
		this.flight = f;
		this.departure = D;
		this.arrival = A;
		this.container = C;
		this.supervisor = S;
		this.OrderID = orderid;
		this.fee = fee;
	}
	public MODE getMode(){
		return mode;
	}
	public String getFlight(){
		return flight;
	}
	public String getDeparture(){
		return departure;
	}
	public String getArrival(){
		return arrival;
	}
	public String getContainer(){
		return container;
	}
	public String getSupervisor(){
		return supervisor;
	}
	public ArrayList<String> getOrderList(){
		return OrderID;
	}
	public double getFee(){
		return fee;
	}

}
