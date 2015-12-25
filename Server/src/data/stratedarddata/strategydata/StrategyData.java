package data.stratedarddata.strategydata;

import java.util.ArrayList;

import dataservice.stratedarddataservice.StrategyDataService;
import po.stratedardPO.StrategyPO;

public class StrategyData implements StrategyDataService {
	public static StrategyList sl = new StrategyList();

	@Override
	public void add(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.addStrategy(sp);

	}

	@Override
	public void change(StrategyPO sp1, StrategyPO sp2) {
		// TODO Auto-generated method stub
		sl.changeStrategy(sp1, sp2);

	}

	@Override
	public void remove(StrategyPO sp) {
		// TODO Auto-generated method stub
		sl.removeStrategy(sp);

	}

	@Override
	public ArrayList<StrategyPO> getStrategyList() {
		// TODO Auto-generated method stub
		ArrayList<StrategyPO> a = sl.getStrategyList();
		return a;
	}

}
