package dataservice.userdataservice;

import java.util.ArrayList;

import po.userPO.UserPO;

public interface UserDataService {
	
	public UserPO find(String id);
	
	public void add(UserPO up);
	
	public void change(UserPO up);
	
	public void remove(UserPO up);
	
	public ArrayList<UserPO> getUserList();
}
