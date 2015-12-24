package dataservice.agencydataservice.agencydataservice;

import java.util.ArrayList;

import po.agencyPO.AgencyPO;

public interface AgencyDataService {
	public AgencyPO find(String id);

	public void add(AgencyPO ap);

	public void change(AgencyPO ap);

	public void remove(AgencyPO ap);

	public ArrayList<AgencyPO> getAgencyList();
}
