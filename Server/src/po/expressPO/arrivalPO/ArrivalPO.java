package po.expressPO.arrivalPO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ArrivalPO implements Serializable {
	private String id;//汽运编号
	private String date;//到达日期
	private String start;//出发地
	private String state;//货物到达状态

	public ArrivalPO(){
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
	public void setStart(String start){
		this.start=start;
	}
	public String getStart(){
		return start;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getState(){
		return state;
	}
}
