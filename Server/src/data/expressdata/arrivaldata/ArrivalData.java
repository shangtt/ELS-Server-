package data.expressdata.arrivaldata;

import java.util.ArrayList;

import po.expressPO.arrivalPO.ArrivalPO;
import dataservice.expressdataservice.arrivaldataservice.ArrivalDataService;

public class ArrivalData  implements ArrivalDataService{
	public static ArrivalList al=new ArrivalList();

	@Override
	public void addArrival(ArrivalPO po) {
		al.addArrival(po);
	}

	@Override
	public void removeArrival(ArrivalPO po) {
		al.removeArrival(po);
	}

	@Override
	public void changeArrival(ArrivalPO po) {
		al.addArrival(po);
	}

	@Override
	public ArrivalPO findArrival(ArrivalPO po) {
		return al.getArrival(po);
	}

	@Override
	public ArrayList<ArrivalPO> getArrivalList() {
		return al.getArrivalList();
	}

}
