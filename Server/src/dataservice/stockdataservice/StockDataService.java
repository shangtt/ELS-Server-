package dataservice.stockdataservice;

import java.util.ArrayList;

import po.stockPO.StockPO;

public interface StockDataService {
	/*
	 * 入库
	 */
	public void add(StockPO po);

	/*
	 * 出库
	 */
	public void remove(StockPO po);

	/*
	 * 库存查看
	 */
	public StockPO find(String orderID);

	/*
	 * 库存调整
	 */
	public void chang(StockPO po1, StockPO po2);

	/*
	 * 库存盘点
	 */
	public ArrayList<StockPO> stockList();

}
