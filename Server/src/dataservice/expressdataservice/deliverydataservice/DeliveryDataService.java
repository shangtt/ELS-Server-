package dataservice.expressdataservice.deliverydataservice;

import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;

public interface DeliveryDataService {
	/*
	 * 添加到达单
	 */
	public void addDeliveryl(DeliveryPO po);

	/*
	 * 删除到达单
	 */
	public void removeDelivery(DeliveryPO po);

	/*
	 * 修改到达单
	 */
	public void changeDelivery(DeliveryPO po1, DeliveryPO po2);

	/*
	 * 查找到达单
	 */
	public DeliveryPO findDelivery(DeliveryPO po);

	/*
	 * 获取到达单列表
	 */
	public ArrayList<DeliveryPO> getArrivalList();
}
