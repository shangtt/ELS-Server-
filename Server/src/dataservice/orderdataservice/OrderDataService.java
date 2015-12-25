package dataservice.orderdataservice;

import java.util.ArrayList;

import po.orderPO.OrderPO;

public interface OrderDataService {
	/*
	 * 添加订单
	 */
	public void addOrder(OrderPO op);

	/*
	 * 查找订单
	 */
	public OrderPO findOrder(OrderPO op);

	/*
	 * 修改订单
	 */
	public void changeOrder(OrderPO op1, OrderPO po2);

	/*
	 * 删除订单（暂时应该不需要。。。
	 */
	public void removeOrder(OrderPO op);

	/*
	 * 获取订单列表
	 */
	public ArrayList<OrderPO> getOrderList();

}
