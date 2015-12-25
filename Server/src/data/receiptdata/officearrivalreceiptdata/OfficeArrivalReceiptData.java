package data.receiptdata.officearrivalreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.OfficeArrivalReceiptDataService;
import po.receiptPO.OfficeArrivalReceiptPO;

public class OfficeArrivalReceiptData implements OfficeArrivalReceiptDataService {
	public static OfficeArrivalReceiptList ol = new OfficeArrivalReceiptList();

	@Override
	public OfficeArrivalReceiptPO find(String Departure) {
		// TODO Auto-generated method stub
		OfficeArrivalReceiptPO op = ol.getOfficeArrivalReceiptPO(Departure);
		return op;
	}

	@Override
	public void add(OfficeArrivalReceiptPO op) {
		// TODO Auto-generated method stub
		ol.addOfficeArrivalReceipt(op);

	}

	@Override
	public void change(OfficeArrivalReceiptPO op1, OfficeArrivalReceiptPO op2) {
		// TODO Auto-generated method stub
		ol.changeOfficeArrivalReceipt(op1, op2);

	}

	@Override
	public void remove(OfficeArrivalReceiptPO op) {
		// TODO Auto-generated method stub
		ol.removeOfficeArrivalReceipt(op);

	}

	@Override
	public ArrayList<OfficeArrivalReceiptPO> getOfficeArrivalReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<OfficeArrivalReceiptPO> a = ol.getOfficeArrivalReceiptList();
		return a;
	}

}
