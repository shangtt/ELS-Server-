package data.receiptdata.stockoutreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.StockOutReceiptDataService;
import po.receiptPO.StockOutReceiptPO;

public class StockOutReceiptData implements StockOutReceiptDataService {
	public static StockOutReceiptList sl = new StockOutReceiptList();

	@Override
	public StockOutReceiptPO find(String transCode) {
		// TODO Auto-generated method stub
		StockOutReceiptPO sp = sl.getStockOutReceiptPO(transCode);
		return sp;
	}

	@Override
	public void add(StockOutReceiptPO sp) {
		// TODO Auto-generated method stub
		sl.addStockOutReceipt(sp);

	}

	@Override
	public void change(StockOutReceiptPO sp1, StockOutReceiptPO sp2) {
		// TODO Auto-generated method stub
		sl.changeCostReceipt(sp1, sp2);

	}

	@Override
	public void remove(StockOutReceiptPO sp) {
		// TODO Auto-generated method stub
		sl.removeStockOutReceipt(sp);

	}

	@Override
	public ArrayList<StockOutReceiptPO> getStockOutReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<StockOutReceiptPO> a = sl.getStockOutReceiptList();
		return a;
	}

}
