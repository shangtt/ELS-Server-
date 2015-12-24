package data.receiptdata.receiptdata.receiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.ReceiptPO;

@SuppressWarnings("serial")
public class ReceiptList implements Serializable {
	public ReceiptPO getReceiptPO(String id) {
		try {
			FileInputStream fis = new FileInputStream("Receipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ReceiptPO> upl = (ArrayList<ReceiptPO>) ois.readObject();
			for (ReceiptPO po : upl) {
				if (po.getID().equals(id)) {
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
	public void addReceipt(ReceiptPO rp) {
		try {
			FileInputStream fis = new FileInputStream("Receipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<ReceiptPO> upl = (ArrayList<ReceiptPO>) ois.readObject();
			upl.add(rp);
			FileOutputStream fs = new FileOutputStream("Receipt.file");
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

	public void removeReceipt(ReceiptPO rp) {
		try {
			FileInputStream fis = new FileInputStream("Receipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ReceiptPO> upl = (ArrayList<ReceiptPO>) ois.readObject();
			ReceiptPO a = null;
			for (ReceiptPO po : upl) {
				if (po.getID().equals(rp.getID())) {
					a = rp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Receipt.file");
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

	public void changeReceipt(ReceiptPO rp) {

		removeReceipt(rp);
		addReceipt(rp);
	}

	public ArrayList<ReceiptPO> getReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("Receipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ReceiptPO> upl = (ArrayList<ReceiptPO>) ois.readObject();
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
