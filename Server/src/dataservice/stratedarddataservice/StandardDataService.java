package dataservice.stratedarddataservice;

import java.util.ArrayList;

import po.stratedardPO.StandardPO;

public interface StandardDataService {
	// public StandardPO find(String orderID);

	public void add(StandardPO sp);

	public void change(StandardPO sp1, StandardPO sp2);

	public void remove(StandardPO sp);

	public ArrayList<StandardPO> getStandardList();

}
