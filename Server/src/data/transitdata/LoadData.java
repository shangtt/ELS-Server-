package data.transitdata;

import java.util.ArrayList;

import po.transitPO.LoadPO;
import dataservice.transitdataservice.LoadDataService;

public class LoadData implements LoadDataService {

	private static LoadList ll = new LoadList();

	@Override
	public void addLoad(LoadPO po) {
		ll.addLoad(po);

	}

	@Override
	public LoadPO findLoad(LoadPO po) {
		return ll.getLoad(po);
	}

	@Override
	public void removeLoad(LoadPO po) {
		ll.removeLoad(po);
	}

	@Override
	public void changeLoad(LoadPO po1, LoadPO po2) {
		ll.changeLoad(po1, po2);
	}

	@Override
	public ArrayList<LoadPO> getLoadList() {
		return ll.getLoadList();
	}

}
