package dataservice.receiptdataservice.billdataservice;

import java.util.ArrayList;

import po.receiptPO.billPO.BillPO;

public interface BillDataService {
	public BillPO find(String order);

	public void add(BillPO bp);

	public void change(BillPO bp);

	public void remove(BillPO bp);

	public ArrayList<BillPO> getBillList();

}
