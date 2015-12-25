package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.ReceiptPO;

public interface ReceiptDataService {
	public ReceiptPO find(String id);

	public void add(ReceiptPO rp);

	public void change(ReceiptPO rp1, ReceiptPO rp2);

	public void remove(ReceiptPO rp);

	public ArrayList<ReceiptPO> getReceiptList();

}
