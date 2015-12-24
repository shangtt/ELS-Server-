package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.TransferReceiptPO;

public interface TransferReceiptDataService {
	public TransferReceiptPO find(String OrderID);

	public void add(TransferReceiptPO cp);

	public void change(TransferReceiptPO cp);

	public void remove(TransferReceiptPO cp);

	public ArrayList<TransferReceiptPO> getTransferReceiptList();

}
