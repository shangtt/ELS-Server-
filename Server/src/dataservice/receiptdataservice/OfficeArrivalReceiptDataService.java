package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.OfficeArrivalReceiptPO;

public interface OfficeArrivalReceiptDataService {
	public OfficeArrivalReceiptPO find(String Departure);

	public void add(OfficeArrivalReceiptPO op);

	public void change(OfficeArrivalReceiptPO op1, OfficeArrivalReceiptPO op2);

	public void remove(OfficeArrivalReceiptPO op);

	public ArrayList<OfficeArrivalReceiptPO> getOfficeArrivalReceiptList();

}
