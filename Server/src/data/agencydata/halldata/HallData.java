package data.agencydata.halldata;

import java.util.ArrayList;

import dataservice.agencydataservice.halldataservice.HallDataService;
import po.agencyPO.HallPO;

public class HallData implements HallDataService {
	public static HallList hl = new HallList();

	@Override
	public HallPO find(String id) {
		// TODO Auto-generated method stub
		HallPO hp = hl.getHallPO(id);
		return hp;
	}

	@Override
	public void add(HallPO hp) {
		// TODO Auto-generated method stub
		hl.addHall(hp);

	}

	@Override
	public void change(HallPO hp1, HallPO hp2) {
		// TODO Auto-generated method stub
		hl.changeHall(hp1, hp2);

	}

	@Override
	public void remove(HallPO hp) {
		// TODO Auto-generated method stub
		hl.removeHall(hp);

	}

	@Override
	public ArrayList<HallPO> getHallList() {
		// TODO Auto-generated method stub
		ArrayList<HallPO> a = hl.getHallList();
		return a;
	}

}
