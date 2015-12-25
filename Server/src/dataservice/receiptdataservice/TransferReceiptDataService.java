package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.TransferReceiptPO;

public interface TransferReceiptDataService {
	public TransferReceiptPO find(String OrderID);

	public void add(TransferReceiptPO tp);

	public void change(TransferReceiptPO tp1, TransferReceiptPO tp2);

	public void remove(TransferReceiptPO tp);

	public ArrayList<TransferReceiptPO> getTransferReceiptList();

}
