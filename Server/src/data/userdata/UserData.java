package data.userdata;

import java.util.ArrayList;

import po.userPO.UserPO;
import dataservice.userdataservice.UserDataService;

public class UserData implements UserDataService {

	public static UserList ul = new UserList();

	public UserPO find(String id) {
		UserPO up = ul.getUserPO(id);
		return up;
	}

	@Override
	public void add(UserPO up) {
		ul.addUser(up);
	}

	@Override
	public void change(UserPO up1, UserPO up2) {
		ul.changeUser(up1, up2);
	}

	public void remove(UserPO up) {
		ul.removeUser(up);
	}

	public ArrayList<UserPO> getUserList() {
		// return ul.getUserList();
		ArrayList<UserPO> a = ul.getUserList();
		return a;
	}

}
