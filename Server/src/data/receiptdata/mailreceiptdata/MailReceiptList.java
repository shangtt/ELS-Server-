package data.receiptdata.mailreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.MailReceiptPO;

@SuppressWarnings("serial")
public class MailReceiptList implements Serializable {
	public MailReceiptPO getMailReceiptPO(String nameOfExpress) {
		try {
			FileInputStream fis = new FileInputStream("MailReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<MailReceiptPO> upl = (ArrayList<MailReceiptPO>) ois.readObject();
			for (MailReceiptPO po : upl) {
				if (po.getNameOfExpress().equals(nameOfExpress)) {
					return po;
				}
			}
			return null;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public void addMailReceipt(MailReceiptPO mp) {
		try {
			FileInputStream fis = new FileInputStream("MailReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<MailReceiptPO> upl = (ArrayList<MailReceiptPO>) ois.readObject();
			upl.add(mp);
			FileOutputStream fs = new FileOutputStream("MailReceipt.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeMailReceipt(MailReceiptPO mp) {
		try {
			FileInputStream fis = new FileInputStream("MailReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<MailReceiptPO> upl = (ArrayList<MailReceiptPO>) ois.readObject();
			MailReceiptPO a = null;
			for (MailReceiptPO po : upl) {
				if (po.getNameOfExpress().equals(mp.getNameOfExpress())) {
					a = mp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("MailReceipt.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(upl);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void changeMailReceipt(MailReceiptPO mp1, MailReceiptPO mp2) {

		removeMailReceipt(mp1);
		addMailReceipt(mp2);
	}

	public ArrayList<MailReceiptPO> getMailReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("MailReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<MailReceiptPO> upl = (ArrayList<MailReceiptPO>) ois.readObject();
			return upl;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
