package po.orderPO;

import java.io.Serializable;
import java.util.ArrayList;

import po.orderPO.TypeOfExpress;
import po.orderPO.TypeOfPack;


@SuppressWarnings("serial")
public class OrderPO implements Serializable{
	private ArrayList<String>stateOfExpress=new ArrayList<String>();//物流状态
	private String id;
	private int numOfGoods;
	private double weight;
	private double size;
	private String nameOfGoods;
	private double fee;
	private TypeOfExpress typeOfExpress;
	private TypeOfPack typeOfPack;
	private String nameOfSender;
	private String addressOfSender;
	private String phoneOfSender;
	private String nameOfAddressee;
	private String addressOfAddressee;
	private String phoneOfAddressee;
	
	public OrderPO(String id,int numOfGoods,double weight,double size, 
			String nameOfGoods,TypeOfExpress typeOfExpress,
			TypeOfPack typeOfPack,String nameOfSender,String addressOfSender,
			String phoneOfSender,String nameOfAddressee,String addressOfAddressee,
			String phoneOfAddressee){
		this.id=id;
		this.numOfGoods=numOfGoods;
		this.weight=weight;
		this.size=size;
		this.nameOfGoods=nameOfGoods;
		this.typeOfExpress=typeOfExpress;
		this.typeOfPack=typeOfPack;
		this.nameOfSender=nameOfSender;
		this.addressOfSender=addressOfSender;
		this.phoneOfSender=phoneOfSender;
		this.nameOfAddressee=nameOfAddressee;
		this.addressOfAddressee=addressOfAddressee;
		this.phoneOfAddressee=phoneOfAddressee;
	}
	public OrderPO(){
		super();
	}
		
	
	public void setStateOfExpress(String stateOfExpress){
		this.stateOfExpress.add(stateOfExpress);
	}	
	public ArrayList<String> getStateOfExpress(){
		return stateOfExpress;
	}
	public void setID(String id){
		this.id=id;
	}
	public String getID(){
		return id;
	}
	public void setNumOfGoods(int num){
		this.numOfGoods=num;
	}
	public int getNumOfGoods(){
		return  numOfGoods;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public double getWeight(){
		return weight;
	}
	public void setSize(double size){
		this.size=size;
	}
	public double getSize(){
		return size;
	}
	public void setNameOfGoods(String name){
		this.nameOfGoods=name;
	}
	public String getNameOfGoods(){
		return nameOfGoods;
	}
	public void setFee(double fee){
		this.fee=fee;
	}
	public double getFee(){
		return fee;
	}
	public void setTypeOfExpress(TypeOfExpress type){
		this.typeOfExpress=type;
	}
	public TypeOfExpress getTypeOfExpress(){
		return typeOfExpress;
	}
	public void setTypeOfPack(TypeOfPack pack){
		this.typeOfPack=pack;
	}
	public TypeOfPack getTypeOfPack(){
		return typeOfPack;
	}
	public void setNameOfSender(String name){
		this.nameOfSender=name;
	}
	public String getNameOfSender(){
		return nameOfSender;
	}
	public void setAddressOfSender(String address){
		this.addressOfSender=address;
	}
	public String getAddressOfSender(){
		return addressOfSender;
	}
	public void setPhoneOfSender(String phone){
		this.phoneOfSender=phone;
	}
	public String getPhoneOfSender(){
		return phoneOfSender;
	}
	public void setNameOfAddress(String name){
		this.nameOfAddressee=name;
	}
	public String getNameOfAddressee(){
		return nameOfAddressee;
	}
	public void setAddressOfAddressee(String address){
		this.addressOfAddressee=address;
	}
	public String getAddressOfAddressee(){
		return addressOfAddressee;
	}
	public void setPhoneOfAddressee(String phone){
		this.phoneOfAddressee=phone;
	}
	public String getPhoneOfAddressee(){
		return phoneOfAddressee;
	}

}


