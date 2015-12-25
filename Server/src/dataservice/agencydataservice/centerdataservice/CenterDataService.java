package dataservice.agencydataservice.centerdataservice;

import java.util.ArrayList;

import po.agencyPO.CenterPO;

public interface CenterDataService {
	public CenterPO find(String id);

	public void add(CenterPO cp);

	public void change(CenterPO cp1, CenterPO cp2);

	public void remove(CenterPO cp);

	public ArrayList<CenterPO> getCenterList();

}
