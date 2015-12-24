package dataservice.stratedarddataservice;

import java.util.ArrayList;

import po.stratedardPO.StrategyPO;

public interface StrategyDataService {
//	public StrategyPO find(String orderID);

	public void add(StrategyPO sp);

	public void change(StrategyPO sp);

	public void remove(StrategyPO sp);

	public ArrayList<StrategyPO> getStrategyList();

}
