package data.agencydata.agencydata;

import java.util.ArrayList;

import dataservice.agencydataservice.agencydataservice.AgencyDataService;
import po.agencyPO.AgencyPO;

public class AgencyData implements AgencyDataService {
	public static AgencyList al = new AgencyList();

	@Override
	public AgencyPO find(String id) {
		AgencyPO ap = al.getAgencyPO(id);
		// TODO Auto-generated method stub
		return ap;
	}

	@Override
	public void add(AgencyPO ap) {
		// TODO Auto-generated method stub
		al.addAgency(ap);

	}

	@Override
	public void change(AgencyPO ap1, AgencyPO ap2) {
		// TODO Auto-generated method stub
		al.changeAgency(ap1, ap2);

	}

	@Override
	public void remove(AgencyPO ap) {
		// TODO Auto-generated method stub
		al.removeAgency(ap);

	}

	@Override
	public ArrayList<AgencyPO> getAgencyList() {
		// TODO Auto-generated method stub
		ArrayList<AgencyPO> a = al.getAgencyList();
		return a;
	}

}
