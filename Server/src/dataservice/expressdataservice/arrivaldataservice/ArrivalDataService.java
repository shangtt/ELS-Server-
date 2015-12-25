package dataservice.expressdataservice.arrivaldataservice;

import java.util.ArrayList;

import po.expressPO.arrivalPO.ArrivalPO;

public interface ArrivalDataService {
	/*
	 * 添加到达单
	 */
	public void addArrival(ArrivalPO po);

	/*
	 * 删除到达单
	 */
	public void removeArrival(ArrivalPO po);

	/*
	 * 修改到达单
	 */
	public void changeArrival(ArrivalPO po1, ArrivalPO po2);

	/*
	 * 查找到达单
	 */
	public ArrivalPO findArrival(ArrivalPO po);

	/*
	 * 获取到达单列表
	 */
	public ArrayList<ArrivalPO> getArrivalList();
}
