package data.receiptdata.stockindata;

import java.util.ArrayList;

import dataservice.receiptdataservice.StockInDataService;
import po.receiptPO.StockInPO;

public class StockInData implements StockInDataService {
	public static StockInList sl = new StockInList();

	@Override
	public StockInPO find(String arrival) {
		// TODO Auto-generated method stub
		StockInPO sp = sl.getCostReceiptPO(arrival);
		return sp;
	}

	@Override
	public void add(StockInPO sp) {
		// TODO Auto-generated method stub
		sl.addStockIn(sp);

	}

	@Override
	public void change(StockInPO sp1, StockInPO sp2) {
		// TODO Auto-generated method stub
		sl.changeCostReceipt(sp1, sp2);

	}

	@Override
	public void remove(StockInPO sp) {
		// TODO Auto-generated method stub
		sl.removeStockIn(sp);

	}

	@Override
	public ArrayList<StockInPO> getStockInList() {
		// TODO Auto-generated method stub
		ArrayList<StockInPO> a = sl.getStockInList();
		return a;
	}

}
