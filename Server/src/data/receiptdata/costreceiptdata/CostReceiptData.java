package data.receiptdata.costreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.CostReceiptDataService;
import po.receiptPO.CostReceiptPO;

public class CostReceiptData implements CostReceiptDataService {
	public static CostReceiptList cl = new CostReceiptList();

	@Override
	public CostReceiptPO find(String account) {
		// TODO Auto-generated method stub
		CostReceiptPO cp = cl.getCostReceiptPO(account);
		return cp;
	}

	@Override
	public void add(CostReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.addCostReceipt(cp);

	}

	@Override
	public void change(CostReceiptPO cp1, CostReceiptPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCostReceipt(cp1, cp2);

	}

	@Override
	public void remove(CostReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.removeCostReceipt(cp);

	}

	@Override
	public ArrayList<CostReceiptPO> getCostReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<CostReceiptPO> a = cl.getCostReceiptList();
		return a;
	}

}
