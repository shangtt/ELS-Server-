package data.agencydata.centerdata;

import java.util.ArrayList;

import dataservice.agencydataservice.centerdataservice.CenterDataService;
import po.agencyPO.CenterPO;

public class CenterData implements CenterDataService {
	public static CenterList cl = new CenterList();

	@Override
	public CenterPO find(String id) {
		// TODO Auto-generated method stub
		CenterPO cp = cl.getCenterPO(id);
		return cp;
	}

	@Override
	public void add(CenterPO cp) {
		// TODO Auto-generated method stub
		cl.addCenter(cp);

	}

	@Override
	public void change(CenterPO cp1, CenterPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCenter(cp1, cp2);

	}

	@Override
	public void remove(CenterPO cp) {
		// TODO Auto-generated method stub
		cl.removeCenter(cp);

	}

	@Override
	public ArrayList<CenterPO> getCenterList() {
		// TODO Auto-generated method stub
		ArrayList<CenterPO> a = cl.getCenterList();
		return a;
	}

}
