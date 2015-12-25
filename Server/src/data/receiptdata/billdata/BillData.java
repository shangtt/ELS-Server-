package data.receiptdata.billdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.billdataservice.BillDataService;
import po.receiptPO.billPO.BillPO;

public class BillData implements BillDataService {
	public static BillList bl = new BillList();

	@Override
	public BillPO find(String order) {
		// TODO Auto-generated method stub
		BillPO bp = bl.getBillPO(order);
		return bp;
	}

	@Override
	public void add(BillPO bp) {
		// TODO Auto-generated method stub
		bl.addBill(bp);

	}

	@Override
	public void change(BillPO bp1, BillPO bp2) {
		// TODO Auto-generated method stub
		bl.changeBill(bp1, bp2);

	}

	@Override
	public void remove(BillPO bp) {
		// TODO Auto-generated method stub
		bl.removeBill(bp);
	}

	@Override
	public ArrayList<BillPO> getBillList() {
		// TODO Auto-generated method stub
		ArrayList<BillPO> a = bl.getBillList();
		return a;
	}

}
