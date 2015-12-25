package data.receiptdata.loadreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.LoadReceiptPO;

@SuppressWarnings("serial")
public class LoadReceiptList implements Serializable {
	public LoadReceiptPO getLoadReceiptPO(String TrunkCode) {
		try {
			FileInputStream fis = new FileInputStream("LoadReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadReceiptPO> upl = (ArrayList<LoadReceiptPO>) ois.readObject();
			for (LoadReceiptPO po : upl) {
				if (po.getTrunkCode().equals(TrunkCode)) {
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
	public void addLoadReceipt(LoadReceiptPO lp) {
		try {
			FileInputStream fis = new FileInputStream("LoadReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<LoadReceiptPO> upl = (ArrayList<LoadReceiptPO>) ois.readObject();
			upl.add(lp);
			FileOutputStream fs = new FileOutputStream("LoadReceipt.file");
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

	public void removeLoadReceipt(LoadReceiptPO lp) {
		try {
			FileInputStream fis = new FileInputStream("LoadReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadReceiptPO> upl = (ArrayList<LoadReceiptPO>) ois.readObject();
			LoadReceiptPO a = null;
			for (LoadReceiptPO po : upl) {
				if (po.getTrunkCode().equals(lp.getTrunkCode())) {
					a = lp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("LoadReceipt.file");
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

	public void changeLoadReceipt(LoadReceiptPO lp1, LoadReceiptPO lp2) {

		removeLoadReceipt(lp1);
		addLoadReceipt(lp2);
	}

	public ArrayList<LoadReceiptPO> getLoadReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("LoadReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadReceiptPO> upl = (ArrayList<LoadReceiptPO>) ois.readObject();
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
