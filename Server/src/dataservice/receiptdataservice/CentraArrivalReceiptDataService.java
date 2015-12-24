package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.CentraArrivalReceiptPO;

public interface CentraArrivalReceiptDataService {
	public CentraArrivalReceiptPO find(String centraCode);

	public void add(CentraArrivalReceiptPO cp);

	public void change(CentraArrivalReceiptPO cp);

	public void remove(CentraArrivalReceiptPO cp);

	public ArrayList<CentraArrivalReceiptPO> getCentraArrivalReceiptList();

}
