package data.receiptdata.receiptdata.receiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.ReceiptDataService;
import po.receiptPO.ReceiptPO;

public class ReceiptData implements ReceiptDataService {
	public static ReceiptList rl = new ReceiptList();

	@Override
	public ReceiptPO find(String id) {
		// TODO Auto-generated method stub
		ReceiptPO rp = rl.getReceiptPO(id);
		return rp;
	}

	@Override
	public void add(ReceiptPO rp) {
		// TODO Auto-generated method stub
		rl.addReceipt(rp);

	}

	@Override
	public void change(ReceiptPO rp) {
		// TODO Auto-generated method stub
		rl.changeReceipt(rp);

	}

	@Override
	public void remove(ReceiptPO rp) {
		// TODO Auto-generated method stub
		rl.removeReceipt(rp);

	}

	@Override
	public ArrayList<ReceiptPO> getReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<ReceiptPO> a = rl.getReceiptList();
		return a;
	}

}
