package dataservice.userdataservice;

import java.util.ArrayList;

import po.userPO.UserPO;

public interface UserDataService {

	public UserPO find(String id);

	public void add(UserPO up);

	public void change(UserPO up1, UserPO up2);

	public void remove(UserPO up);

	public ArrayList<UserPO> getUserList();
}
