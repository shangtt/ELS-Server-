package po.transitPO;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class TransitOrderPO implements Serializable{
	protected String id;
	protected String date;
	protected ArrayList<String> orderList=new ArrayList<String>();
	protected double fare;
	protected String supervisor;//监装员
	private String  escort;//押运员
	
	public void setEscort(String escort){
		this.escort=escort;
	}
	public String getEscort(){
		return escort;
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
	public void addOrderList(String od){
		this.orderList.add(od);
	}
	public ArrayList<String> getOrderList(){
		return orderList;
	}
	public void setFare(double fare){
		this.fare=fare;
	}
	public double getFare(){
		return fare;
	}
	public void setSupervisor(String name){
		this.supervisor=name;
	}
	public String getSupervisor(){
		return supervisor;
	}
}
