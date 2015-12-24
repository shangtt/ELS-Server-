package po.transitPO;

@SuppressWarnings("serial")
public class TransitPO extends TransitOrderPO {
	//记录装运日期、本中转中心货运编号、出发地、到达地、监装员、本次装箱所有托运单号、运费，车次号，车厢号huo
	//记录装运日期、本中转中心汽运编号、出发地、到达地、监装员。本次装箱所有托运单号、运费、车次号、押运员qi
	//记录装运日期、本中转中心航运编号、出发地、到达地、监装员、本次装箱所有托运单号、运费，航班号，货柜号feiji
	private String  mean;//装运方式
	private String start;//出发地
	private String arrival;//到达地
	private String flightNumber;//航班号
	private String trainNumber;//车次号
	private String coachNumber;//车厢号
	private String containerNumber;//货柜号

	
	public TransitPO(){
		super();
	}

	public void setMean(String mean){
		this.mean=mean;
	}
	public String getMean() {
		return mean;
	}
	public void setStrat(String start){
		this.start=start;
	}
	public String getStart() {
		return start;
	}
	
	public void setArrival(String arrival){
		this.arrival=arrival;
	}
	public String getArrival() {
		return arrival;
	}
	
	public void setFlightNumber(String flight){
		this.flightNumber=flight;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void setTrainNumber(String train){
		this.trainNumber=train;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	
	public void setCoachNumber(String coach){
		this.coachNumber=coach;
	}
	public String getCoachNumber() {
		return coachNumber;
	}
	
	public void setContainerNumber(String container){
		this.containerNumber=container;
	}
	public String getContainerNumber() {
		return containerNumber ;
	}

}