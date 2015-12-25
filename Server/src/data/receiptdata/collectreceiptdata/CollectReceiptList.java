package data.receiptdata.collectreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.CollectReceiptPO;

@SuppressWarnings("serial")
public class CollectReceiptList implements Serializable {
	public CollectReceiptPO getCollectReceiptPO(String NameOfCourier) {
		try {
			FileInputStream fis = new FileInputStream("CollectReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CollectReceiptPO> upl = (ArrayList<CollectReceiptPO>) ois.readObject();
			for (CollectReceiptPO po : upl) {
				if (po.getNameOfCourier().equals(NameOfCourier)) {
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
	public void addCollectReceipt(CollectReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CollectReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CollectReceiptPO> upl = (ArrayList<CollectReceiptPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("CollectReceipt.file");
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

	public void removeCollectReceipt(CollectReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CollectReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CollectReceiptPO> upl = (ArrayList<CollectReceiptPO>) ois.readObject();
			CollectReceiptPO a = null;
			for (CollectReceiptPO po : upl) {
				if (po.getNameOfCourier().equals(cp.getNameOfCourier())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("CollectReceipt.file");
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

	public void changeCollectReceipt(CollectReceiptPO cp1, CollectReceiptPO cp2) {

		removeCollectReceipt(cp1);
		addCollectReceipt(cp2);
	}

	public ArrayList<CollectReceiptPO> getCollectReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("CollectReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CollectReceiptPO> upl = (ArrayList<CollectReceiptPO>) ois.readObject();
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
