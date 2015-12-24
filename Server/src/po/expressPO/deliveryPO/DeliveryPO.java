package po.expressPO.deliveryPO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DeliveryPO implements Serializable{

	private String id;
	private String date;
	private String courier;
	
	public DeliveryPO(String id,String date,String courier){
		this.id=id;
		this.date=date;
		this.courier=courier;
	}
	public DeliveryPO(){
		super();
	}
	
	public void setID(String id){
		this.id=id;
	}
	public String getID(){
		return id;
	}
	public void setDate(String date){
		this.date=date;
	}
	public String getDate(){
		return date;
	}
	public void setCourier(String courier){
		this.courier=courier;
	}
	public String getCourier(){
		return courier;
	}
}
