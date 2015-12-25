package data.receiptdata.collectreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.CollectReceiptDataService;
import po.receiptPO.CollectReceiptPO;

public class CollectReceiptData implements CollectReceiptDataService {
	public static CollectReceiptList cl = new CollectReceiptList();

	@Override
	public CollectReceiptPO find(String NameOfCourier) {
		// TODO Auto-generated method stub
		CollectReceiptPO cp = cl.getCollectReceiptPO(NameOfCourier);
		return cp;
	}

	@Override
	public void add(CollectReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.addCollectReceipt(cp);

	}

	@Override
	public void change(CollectReceiptPO cp1, CollectReceiptPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCollectReceipt(cp1, cp2);

	}

	@Override
	public void remove(CollectReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.removeCollectReceipt(cp);

	}

	@Override
	public ArrayList<CollectReceiptPO> getCollectReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<CollectReceiptPO> a = cl.getCollectReceiptList();
		return a;
	}

}
