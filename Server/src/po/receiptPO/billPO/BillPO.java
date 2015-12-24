package po.receiptPO.billPO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BillPO implements Serializable{
	private String order;
	private String courier;
	private double fee=0;
	private String date;
	
	public BillPO(){
		super();
	}
	public void  setOrder(String o){
		this.order=o;
	}
	public String getOrder(){
		return order;
	}
	public void setCourier(String courier){
		this.courier=courier;
	}
	public String getCourier(){
		return courier;
	}
	public void addFee(double fee){
		this.fee+=fee;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public double getFee(){
		return fee;
	}
	public void setDate(String date){
		this.date=date;
	}
	public String getDate(){
		return date;
	}
}
