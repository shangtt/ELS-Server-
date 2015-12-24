package po.agencyPO;

import java.io.Serializable;


@SuppressWarnings("serial")
public class AgencyPO implements Serializable{
	protected String city;				//000 for Management
	protected String id;					//000
	
	public AgencyPO(String c,String i){
		this.city = c;
		this.id = i;
	}
	public AgencyPO(){
		super();
	}

	public void  setCity(String city){
		this.city=city;
	}
	public String getCity() {
		return city;
	}

	public void setID(String id){
		this.id=id;
	}
	public String getID(){
		return id;
	}
	
	
}
