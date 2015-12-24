package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.StockInPO;

public interface StockInDataService {
	public StockInPO find(String arrival);

	public void add(StockInPO sp);

	public void change(StockInPO sp);

	public void remove(StockInPO sp);

	public ArrayList<StockInPO> getStockInList();

}
