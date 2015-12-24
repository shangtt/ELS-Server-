package dataservice.accountdataservice;

import java.util.ArrayList;

import po.accountPO.AccountPO;

import rmi.MessageImpl;

public interface AccountDataService {
	public AccountPO find(String name);

	public void add(AccountPO ap);

	public void change(AccountPO ap1,AccountPO ap2);

	public void remove(AccountPO ap);

	public ArrayList<AccountPO> getAccountList();

//	public IMessage 
}
