package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.DeliverReceiptPO;

public interface DeliverReceiptDataService {
	public DeliverReceiptPO find(String NameOfCourier);

	public void add(DeliverReceiptPO dp);

	public void change(DeliverReceiptPO dp1, DeliverReceiptPO dp2);

	public void remove(DeliverReceiptPO dp);

	public ArrayList<DeliverReceiptPO> getDeliverReceiptList();

}
