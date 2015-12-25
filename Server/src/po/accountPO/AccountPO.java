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
	private String name;	//Account Title
	private double balance;	//Account Balance
	
	public AccountPO (String i,String n,double b){
		//this.id = i;
		this.name = n;
		this.balance = b;
	}
	public AccountPO(){
		super();
	}

	
	public void setName(String n){
		this.name = n;
	}
	public String getName(){
		return name;
	}
	public void setBalance(double q){
		this.balance=q;
		
	}
	public double getBalance(){
		return balance;
	}
}
