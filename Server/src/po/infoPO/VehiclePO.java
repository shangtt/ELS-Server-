package po.infoPO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class VehiclePO implements Serializable {
	private String code;//车辆代号
	private String numberOfEngine;//引擎号
	private String plateNumber;//车牌号
	private String chassisNumber;//车牌号
	private String dateOfBuy;//购买时间
	private String dateOfService;//服役时间
	
	public VehiclePO(String code,String numberOfEngine,String plateNumber,
			String chassisNumber,String buy,String dateOfService){
		this.code=code;
		this.numberOfEngine=numberOfEngine;
		this.plateNumber=plateNumber;
		this.chassisNumber=chassisNumber;
		this.dateOfBuy=buy;
		this.dateOfService=dateOfService;
	}
	public VehiclePO() {
		super();
	}
	public void setCode(String code){
		this.code=code;
	}
	public String getCode(){
		return code;
	}
	public void setNumberOfEngine(String num){
		this.numberOfEngine=num;
	}
	public String getNumberOfEngine(){
		return numberOfEngine;
	}
	public void setPlateNumber(String p){
		this.plateNumber=p;
	}
	public String getPlateNumber(){
		return plateNumber;
	}
	public void setChassisNumber(String c){
		this.chassisNumber=c;
	}
	public String getChassisNumber(){
		return chassisNumber;
	}
	public void setDateOfBuy(String d){
		this.dateOfBuy=d;
	}
	public String getDateOfBuy(){
		return dateOfBuy;
	}
	public void setDateOfService(String d){
		this.dateOfService=d;
	}
	public String getDateOfService(){
		return dateOfService;
	}

}
