package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.CostReceiptPO;

public interface CostReceiptDataService {
	public CostReceiptPO find(String NameOfCourier);

	public void add(CostReceiptPO cp);

	public void change(CostReceiptPO cp1, CostReceiptPO cp2);

	public void remove(CostReceiptPO cp);

	public ArrayList<CostReceiptPO> getCostReceiptList();

}
