package po.transitPO;

@SuppressWarnings("serial")
public class LoadPO extends TransitOrderPO{
	
	private String idOfHall;//营业厅编号
	private String arrival;//到达地
//	private String  escort;//押运员
	
	public LoadPO(){
		super();
	}

	public void setIDofHall(String id){
		this.idOfHall=id;
	}
	
	public String getIDOfHall(){
		return idOfHall;
	}
	
	public void setArrival(String arrival){
		this.arrival=arrival;
	}
	public String getArrival(){
		return arrival;
	}
//	public void setEscort(String escort){
//		this.escort=escort;
//	}
//	public String getEscort(){
//		return escort;
//	}


}
