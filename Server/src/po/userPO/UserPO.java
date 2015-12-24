package po.userPO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserPO implements Serializable{
	/**
	 * 
	 */
	private String id;
	private String password;
	private UserRole role;
	
	public UserPO(String i, String p,UserRole r){
		this.id = i;
		this.password = p;
		this.role = r;
	}
	public UserPO(){
		super();
	}
	
	public void setID(String i){
		this.id = i;
	}
	public String getID(){
		return id;
	}
	
	public void setPassword(String p){
		this.password = p;
	}
	public String getPassword(){
		return password;
	}
	
	public void setRole(UserRole r){
		this.role = r;
	}
	public UserRole getRole(){
		return role;
	}
	
}
