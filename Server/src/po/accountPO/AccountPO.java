package po.accountPO;

import java.io.Serializable;

/**
 *bank account
 *@param String id
 *@param String name
 *@param double balance
 */
@SuppressWarnings("serial")
public class AccountPO implements Serializable{
	
	/**
	 * 
	 */
	//private String id;		//19 bits at most
	private String name;	//Account Title
	private double balance;	//Account Balance
	
	public AccountPO (String i,String n,double b){
		//this.id = i;
		this.name = n;
		this.balance = b;
	}
	
	
//	public String getID(){
//		return id;
//	}
	
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
}
