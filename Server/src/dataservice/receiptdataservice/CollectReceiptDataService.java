package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.CollectReceiptPO;

public interface CollectReceiptDataService {
	public CollectReceiptPO find(String NameOfCourier);

	public void add(CollectReceiptPO cp);

	public void change(CollectReceiptPO cp);

	public void remove(CollectReceiptPO cp);

	public ArrayList<CollectReceiptPO> getCollectReceiptList();

}
