package data.receiptdata.transferreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.TransferReceiptDataService;
import po.receiptPO.TransferReceiptPO;

public class TransferReceiptData implements TransferReceiptDataService {
	public static TransferReceiptList tl = new TransferReceiptList();

	@Override
	public TransferReceiptPO find(String flight) {
		// TODO Auto-generated method stub
		TransferReceiptPO tp = tl.getTransferReceiptPO(flight);
		return tp;
	}

	@Override
	public void add(TransferReceiptPO tp) {
		// TODO Auto-generated method stub
		tl.addTransferReceipt(tp);

	}

	@Override
	public void change(TransferReceiptPO tp1, TransferReceiptPO tp2) {
		// TODO Auto-generated method stub
		tl.changeTransferReceipt(tp1, tp2);

	}

	@Override
	public void remove(TransferReceiptPO tp) {
		// TODO Auto-generated method stub
		tl.removeTransferReceipt(tp);

	}

	@Override
	public ArrayList<TransferReceiptPO> getTransferReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<TransferReceiptPO> a = tl.getTransferReceiptList();
		return a;
	}

}
