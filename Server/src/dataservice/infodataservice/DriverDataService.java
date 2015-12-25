package dataservice.infodataservice;

import java.util.ArrayList;

import po.infoPO.DriverPO;

public interface DriverDataService {
	/*
	 * 增加司机
	 */
	public void addDriver(DriverPO po);

	/*
	 * 删除司机
	 */
	public void removeDriver(DriverPO po);

	/*
	 * 修改司机信息
	 */
	public void changeDriver(DriverPO po1, DriverPO po2);

	/*
	 * 查找司机
	 */
	public DriverPO findDriver(DriverPO po);

	/*
	 * 获取司机列表
	 */
	public ArrayList<DriverPO> getDricerList();

}
