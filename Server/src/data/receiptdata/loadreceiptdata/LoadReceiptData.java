package data.receiptdata.loadreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.LoadReceiptDataService;
import po.receiptPO.LoadReceiptPO;

public class LoadReceiptData implements LoadReceiptDataService {
	public static LoadReceiptList ll = new LoadReceiptList();

	@Override
	public LoadReceiptPO find(String TrunkCode) {
		// TODO Auto-generated method stub
		LoadReceiptPO lp = ll.getLoadReceiptPO(TrunkCode);
		return lp;
	}

	@Override
	public void add(LoadReceiptPO lp) {
		// TODO Auto-generated method stub
		ll.addLoadReceipt(lp);

	}

	@Override
	public void change(LoadReceiptPO lp1, LoadReceiptPO lp2) {
		// TODO Auto-generated method stub
		ll.changeLoadReceipt(lp1, lp2);

	}

	@Override
	public void remove(LoadReceiptPO lp) {
		// TODO Auto-generated method stub
		ll.removeLoadReceipt(lp);

	}

	@Override
	public ArrayList<LoadReceiptPO> getLoadReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<LoadReceiptPO> a = ll.getLoadReceiptList();
		return a;
	}

}
