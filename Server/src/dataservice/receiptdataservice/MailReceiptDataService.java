package dataservice.receiptdataservice;

import java.util.ArrayList;

import po.receiptPO.MailReceiptPO;

public interface MailReceiptDataService {
	public MailReceiptPO find(String nameOfExpress);

	public void add(MailReceiptPO mp);

	public void change(MailReceiptPO mp1, MailReceiptPO mp2);

	public void remove(MailReceiptPO mp);

	public ArrayList<MailReceiptPO> getMailReceiptList();

}
