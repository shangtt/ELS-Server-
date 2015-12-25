package dataservice.infodataservice;

import java.util.ArrayList;

import po.infoPO.VehiclePO;

public interface VehicleDataService {
	/*
	 * 添加车辆
	 */
	public void addVehicle(VehiclePO po);

	/*
	 * 删除车辆
	 */
	public void removeVehicle(VehiclePO po);

	/*
	 * 修改车辆
	 */
	public void changeVehicle(VehiclePO po1, VehiclePO po2);

	/*
	 * 查找车辆
	 */
	public VehiclePO find(VehiclePO po);

	/*
	 * 获取车辆列表
	 */
	public ArrayList<VehiclePO> getVehicleList();

}
