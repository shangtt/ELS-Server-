package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.CollectReceiptPO;

public interface CollectReceiptDataService {
	public CollectReceiptPO find(String account);

	public void add(CollectReceiptPO cp);

	public void change(CollectReceiptPO cp1, CollectReceiptPO cp2);

	public void remove(CollectReceiptPO cp);

	public ArrayList<CollectReceiptPO> getCollectReceiptList();

}
