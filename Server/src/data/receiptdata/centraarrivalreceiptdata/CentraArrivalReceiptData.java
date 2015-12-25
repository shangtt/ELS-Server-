package data.receiptdata.centraarrivalreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.CentraArrivalReceiptDataService;
import po.receiptPO.CentraArrivalReceiptPO;

public class CentraArrivalReceiptData implements CentraArrivalReceiptDataService {
	public static CentraArrivalReceiptList cl = new CentraArrivalReceiptList();

	@Override
	public CentraArrivalReceiptPO find(String centraCode) {
		// TODO Auto-generated method stub
		CentraArrivalReceiptPO cp = cl.getCentraArrivalReceiptPO(centraCode);
		return cp;
	}

	@Override
	public void add(CentraArrivalReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.addCentraArrivalReceipt(cp);

	}

	@Override
	public void change(CentraArrivalReceiptPO cp1, CentraArrivalReceiptPO cp2) {
		// TODO Auto-generated method stub
		cl.changeCentraArrivalReceipt(cp1, cp2);
	}

	@Override
	public void remove(CentraArrivalReceiptPO cp) {
		// TODO Auto-generated method stub
		cl.removeCentraArrivalReceipt(cp);

	}

	@Override
	public ArrayList<CentraArrivalReceiptPO> getCentraArrivalReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<CentraArrivalReceiptPO> a = cl.getCentraArrivalReceiptList();
		return a;
	}

}
