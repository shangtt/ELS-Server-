package po.stockPO;

import java.io.Serializable;

//库存入库（订单号、入库日期、审批状态、目的地、区、排、架、位）
//库存出库（订单号、出库日期、审批状态、目的地、装运形式、中转单编号或汽运编号）
//其他属性（库存容量、警戒比例90%、金额、合计库存数量）
@SuppressWarnings("serial")
public class StockPO implements Serializable{
	
	//在入库时调用add方法增加库存数量，在出库时调用minus方法减少库存数量
	 private String orderID;	//订单号
	 private String arrival;	//目的地
	 
	 private String dateIn;		//入库日期
	 private String area;	//区（航运、铁运、汽运、机动）
	 private String row;			//排
	 private String shelf;			//架
	 private String seat;			//位
	 
	 private String dateOut;	//出库日期
	 private String mean;	//装运方式（飞机、火车、汽车）
	 private String code;		//中转单或汽运编号
	 
	 private static int MAX_NUMBER;			//最大容量 常量（需要set与get吗）
	 private double rate;		//警戒比例（0-1）
	 private int num;	//库存数量
	 private double money;//当前订单合计金额
	 
	 public StockPO (String id,String arrival,
			 String datein,String area,String row,String shelf,String seat,
			 String dateout,String mean,String code,double rate,
			 int numcurrent,double moneycurrent) {
		this.orderID = id;
		this.arrival = arrival;
		
		this.dateIn = datein;
		this.area = area;
		this.row = row;
		this.shelf = shelf;
		this.seat = seat;
		
		this.dateOut = dateout;
		this.mean = mean;
		this.code = code;
		
		this.rate = rate;
		this.num = numcurrent;
		this.money = moneycurrent;
	}
	 
	public StockPO(){
		super();
	}
	public void setMax_Number(int m){
		StockPO.MAX_NUMBER=m;
	}
	public int getMax_Number(){
		return MAX_NUMBER;
	}
	//快递单号
	public void setOrderID(String id){
		this.orderID = id;
	}
	public String getOrderID(){
		return orderID;
	}
	//目的地
	public void setArrival(String arr){
		this.arrival = arr;
	}
	public String getArrival(){
		return arrival;
	}
	//入库日期
	public void setDateIn(String d){
		this.dateIn = d;
	}
	public String getDateIn(){
		return dateIn;
	}
	//区
	public void setArea(String a){
		this.area = a;
	}
	public String getArea(){
		return area;
	}
	//排
	public void setRow(String row){
		this.row = row;
	}
	public String getRow(){
		return row;
	}
	//架
	public void setShelf(String s){
		this.shelf = s;
	}
	public String getShelf(){
		return shelf;
	}
	//位
	public void setSeat(String s){
		this.seat = s;
	}
	public String getSeat(){
		return seat;
	}
	//出库日期
	public void setDateOut(String d){
		this.dateOut = d;
	}
	public String getDateOut(){
		return dateOut;
	}
	//装运方式
	public void setTransMode(String t){
		this.mean = t;
	}
	public String getTransMode(){
		return mean;
	}
	//中转单或汽运编号
	public void setCode(String c){
		this.code = c;
	}
	public String getCode(){
		return code;
	}
	//最大容量
	public void setMAX_NUMBER(int num){
		StockPO.MAX_NUMBER = num;
	}
	public int getMAX_NUMBER(){
		return MAX_NUMBER;
	}
	//警戒比例
	public void setRate(double r){
		this.rate = r;
	}
	public double getRate(){
		return rate;
	}
	//库存数量
	public void setNum(int numin){
		this.num = numin;
	}
	public int getNum(){
		return num;
	}
	//金额
	public void setMoney(double m){
		this.money = m;
	}
	public double getMoney(){
		return money;
	}
}