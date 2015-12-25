package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.StockOutReceiptPO;

public interface StockOutReceiptDataService {
	public StockOutReceiptPO find(String transCode);

	public void add(StockOutReceiptPO sp);

	public void change(StockOutReceiptPO sp1, StockOutReceiptPO sp2);

	public void remove(StockOutReceiptPO sp);

	public ArrayList<StockOutReceiptPO> getStockOutReceiptList();

}
