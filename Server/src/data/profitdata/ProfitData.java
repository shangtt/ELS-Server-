package data.profitdata;

import java.util.ArrayList;

import dataservice.profitdataservice.ProfitDataService;
import po.profitPO.ProfitPO;

public class ProfitData implements ProfitDataService {
	public static ProfitList pl = new ProfitList();

	@Override
	public void add(ProfitPO pp) {
		// TODO Auto-generated method stub
		pl.addProfit(pp);

	}

	@Override
	public void change(ProfitPO pp) {
		// TODO Auto-generated method stub
		pl.changeAccount(pp);

	}

	@Override
	public void remove(ProfitPO pp) {
		// TODO Auto-generated method stub
		pl.removeProfit(pp);

	}

	@Override
	public ArrayList<ProfitPO> getProfitList() {
		// TODO Auto-generated method stub
		ArrayList<ProfitPO> a = pl.getProfitList();
		return a;
	}

}
