package data.infodata;

import java.util.ArrayList;

import po.infoPO.DriverPO;
import dataservice.infodataservice.DriverDataService;

public class DriverData implements DriverDataService {
	private static DriverList dl = new DriverList();

	@Override
	public void addDriver(DriverPO po) {
		dl.addDriver(po);

	}

	@Override
	public void removeDriver(DriverPO po) {
		dl.removeDriver(po);

	}

	@Override
	public void changeDriver(DriverPO po1, DriverPO po2) {
		dl.changeDriver(po1, po2);

	}

	@Override
	public DriverPO findDriver(DriverPO po) {
		return dl.getDriver(po);
	}

	@Override
	public ArrayList<DriverPO> getDricerList() {
		return dl.getDriverList();
	}

}
