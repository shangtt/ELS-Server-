package data.accountdata;

import java.util.ArrayList;

import dataservice.accountdataservice.AccountDataService;
import po.accountPO.AccountPO;

public class AccountData implements AccountDataService {
	public static AccountList al = new AccountList();

	@Override
	public AccountPO find(String name) {
		// TODO Auto-generated method stub
		AccountPO ap = al.getAccountPO(name);
		return ap;
	}

	@Override
	public void add(AccountPO ap) {
		// TODO Auto-generated method stub
		al.addAccount(ap);
	}

	@Override
	public void change(AccountPO ap1, AccountPO ap2) {
		// TODO Auto-generated method stub
		al.changeAccount(ap1, ap2);
	}

	@Override
	public void remove(AccountPO ap) {
		// TODO Auto-generated method stub
		al.removeAccount(ap);
	}

	@Override
	public ArrayList<AccountPO> getAccountList() {
		// return al.getAccountList();
		// TODO Auto-generated method stub
		ArrayList<AccountPO> a = al.getAccountList();
		return a;
	}

}
