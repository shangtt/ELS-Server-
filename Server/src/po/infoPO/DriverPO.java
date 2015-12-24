package po.infoPO;

import java.io.Serializable;


@SuppressWarnings("serial")
public class DriverPO implements Serializable{
	private String idCode;		//cityCode+officeCode+id 9 bits
	private String name;		
	private String sex;
	private String IDNumber;
	private String age;
	private String Tele;
	private String Period;		//2010/01/01-2030/01/01 driver license period
	private String Institution;
	
	public DriverPO(String id,String n,String s,String IDNUM,String b,String tele,String p,String ins){
		this.idCode = id;
		this.name = n;
		this.sex = s;
		this.IDNumber = IDNUM;
		this.age = b;
		this.Tele = tele;
		this.Period = p;
		this.Institution = ins;
	}
	public DriverPO(){
		super();
	}
	public void setIDCode(String id){
		this.idCode=id;
	}
	public String getIDCode(){
		return idCode;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setage(String b){
		this.age=b;
		
	}
	public String getage(){
		return age;
	}
	public void setIDNumber(String id){
		this.IDNumber=id;
	}
	public String getIDNumber(){
		return IDNumber;
	}
	public void setTele(String tele){
		this.Tele=tele;
	}
	public String getTele(){
		return Tele;
	}
	public void setSex(String sex){
		this.sex=sex;
	}
	public String getSex(){
		return sex;
	}
	public void setPeriod(String p){
		this.Period=p;
	}
	public String getPeriod(){
		return Period;
	}
	public void setInstitution(String i){
		this.Institution=i;
	}
	public String getInstitution(){
		return Institution;
	}
}
