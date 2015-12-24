package dataservice.agencydataservice.halldataservice;

import java.util.ArrayList;

import po.agencyPO.HallPO;

public interface HallDataService {
	public HallPO find(String id);

	public void add(HallPO hp);

	public void change(HallPO hp);

	public void remove(HallPO hp);

	public ArrayList<HallPO> getHallList();

}
