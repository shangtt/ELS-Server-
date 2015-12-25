package data.stockdata;

import java.util.ArrayList;

import dataservice.stockdataservice.StockDataService;
import po.stockPO.StockPO;

public class StockData implements StockDataService {
	public static StockList sl = new StockList();

	@Override
	public void add(StockPO sp) {
		// TODO Auto-generated method stub
		sl.addStock(sp);

	}

	@Override
	public void remove(StockPO sp) {
		// TODO Auto-generated method stub
		sl.removeStock(sp);

	}

	@Override
	public StockPO find(String orderID) {
		// TODO Auto-generated method stub
		StockPO sp = sl.getStockPO(orderID);
		return sp;
	}

	@Override
	public void chang(StockPO sp1, StockPO sp2) {
		// TODO Auto-generated method stub
		sl.changeStock(sp1, sp2);
	}

	@Override
	public ArrayList<StockPO> stockList() {
		// TODO Auto-generated method stub
		ArrayList<StockPO> a = sl.getStockist();
		return a;
	}

}
