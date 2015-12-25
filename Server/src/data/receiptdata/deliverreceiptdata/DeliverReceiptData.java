package data.receiptdata.deliverreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.DeliverReceiptDataService;
import po.receiptPO.DeliverReceiptPO;

public class DeliverReceiptData implements DeliverReceiptDataService {
	public static DeliverReceiptList dl = new DeliverReceiptList();

	@Override
	public DeliverReceiptPO find(String NameOfCourier) {
		// TODO Auto-generated method stub
		DeliverReceiptPO dp = dl.getDeliverReceiptPO(NameOfCourier);
		return dp;
	}

	@Override
	public void add(DeliverReceiptPO dp) {
		// TODO Auto-generated method stub
		dl.addDeliverReceipt(dp);

	}

	@Override
	public void change(DeliverReceiptPO dp1, DeliverReceiptPO dp2) {
		// TODO Auto-generated method stub
		dl.changeDeliverReceipt(dp1, dp2);

	}

	@Override
	public void remove(DeliverReceiptPO dp) {
		// TODO Auto-generated method stub
		dl.removeDeliverReceipt(dp);

	}

	@Override
	public ArrayList<DeliverReceiptPO> getDeliverReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<DeliverReceiptPO> a = dl.getDeliverReceiptList();
		return a;
	}

}
