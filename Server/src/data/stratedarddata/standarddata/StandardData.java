package data.stratedarddata.standarddata;

import java.util.ArrayList;

import dataservice.stratedarddataservice.StandardDataService;
import po.stratedardPO.StandardPO;

public class StandardData implements StandardDataService {
	public static StandardList sl = new StandardList();

	@Override
	public void add(StandardPO sp) {
		// TODO Auto-generated method stub
		sl.addStandard(sp);

	}

	@Override
	public void change(StandardPO sp) {
		// TODO Auto-generated method stub
		sl.changeAccount(sp);

	}

	@Override
	public void remove(StandardPO sp) {
		// TODO Auto-generated method stub
		sl.removeStandard(sp);

	}

	@Override
	public ArrayList<StandardPO> getStandardList() {
		// TODO Auto-generated method stub
		ArrayList<StandardPO> a = sl.getStandardList();
		return a;
	}

}
