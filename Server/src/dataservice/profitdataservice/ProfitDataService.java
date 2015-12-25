package dataservice.profitdataservice;

import java.util.ArrayList;

import po.profitPO.ProfitPO;

public interface ProfitDataService {
	// public ProfitPO find(String name);

	public void add(ProfitPO pp);

	public void change(ProfitPO pp1, ProfitPO pp2);

	public void remove(ProfitPO pp);

	public ArrayList<ProfitPO> getProfitList();

}
