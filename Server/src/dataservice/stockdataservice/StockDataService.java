package dataservice.stockdataservice;

import java.util.ArrayList;

import po.stockPO.StockPO;
//import vo.stockVO.StockVO;

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
	public StockPO find(StockPO po);
	/*
	 * 库存调整
	 */
	public StockPO chang(StockPO po);
	/*
	 * 库存盘点
	 */
	public ArrayList<StockPO> stockList();


}
