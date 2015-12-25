package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.LoadReceiptPO;

public interface LoadReceiptDataService {
	public LoadReceiptPO find(String OrderID);

	public void add(LoadReceiptPO lp);

	public void change(LoadReceiptPO lp1, LoadReceiptPO lp2);

	public void remove(LoadReceiptPO lp);

	public ArrayList<LoadReceiptPO> getLoadReceiptList();

}
