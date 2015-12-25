package data.receiptdata.mailreceiptdata;

import java.util.ArrayList;

import dataservice.receiptdataservice.MailReceiptDataService;
import po.receiptPO.MailReceiptPO;

public class MailReceiptData implements MailReceiptDataService {
	public static MailReceiptList ml = new MailReceiptList();

	@Override
	public MailReceiptPO find(String nameOfExpress) {
		// TODO Auto-generated method stub
		MailReceiptPO mp = ml.getMailReceiptPO(nameOfExpress);
		return mp;
	}

	@Override
	public void add(MailReceiptPO mp) {
		// TODO Auto-generated method stub
		ml.addMailReceipt(mp);

	}

	@Override
	public void change(MailReceiptPO mp1, MailReceiptPO mp2) {
		// TODO Auto-generated method stub
		ml.changeMailReceipt(mp1, mp2);

	}

	@Override
	public void remove(MailReceiptPO mp) {
		// TODO Auto-generated method stub
		ml.removeMailReceipt(mp);

	}

	@Override
	public ArrayList<MailReceiptPO> getMailReceiptList() {
		// TODO Auto-generated method stub
		ArrayList<MailReceiptPO> a = ml.getMailReceiptList();
		return a;
	}

}
