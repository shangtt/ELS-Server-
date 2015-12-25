package data.infodata;

import java.util.ArrayList;

import po.infoPO.VehiclePO;
import dataservice.infodataservice.VehicleDataService;

public class VehicleData implements VehicleDataService {
	private static VehicleList vl = new VehicleList();

	@Override
	public void addVehicle(VehiclePO po) {
		vl.addVehicle(po);

	}

	@Override
	public void removeVehicle(VehiclePO po) {
		vl.removeVehicle(po);

	}

	@Override
	public void changeVehicle(VehiclePO po1, VehiclePO po2) {
		vl.changeVehicle(po1, po2);

	}

	@Override
	public VehiclePO find(VehiclePO po) {
		return vl.getVehicle(po);
	}

	@Override
	public ArrayList<VehiclePO> getVehicleList() {
		return vl.getVehicleList();
	}

}
