package data.receiptdata.deliverreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.DeliverReceiptPO;

@SuppressWarnings("serial")
public class DeliverReceiptList implements Serializable {
	public DeliverReceiptPO getDeliverReceiptPO(String NameOfCourier) {
		try {
			FileInputStream fis = new FileInputStream("DeliverReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliverReceiptPO> upl = (ArrayList<DeliverReceiptPO>) ois.readObject();
			for (DeliverReceiptPO po : upl) {
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
	public void addDeliverReceipt(DeliverReceiptPO dp) {
		try {
			FileInputStream fis = new FileInputStream("DeliverReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<DeliverReceiptPO> upl = (ArrayList<DeliverReceiptPO>) ois.readObject();
			upl.add(dp);
			FileOutputStream fs = new FileOutputStream("DeliverReceipt.file");
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

	public void removeDeliverReceipt(DeliverReceiptPO dp) {
		try {
			FileInputStream fis = new FileInputStream("DeliverReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliverReceiptPO> upl = (ArrayList<DeliverReceiptPO>) ois.readObject();
			DeliverReceiptPO a = null;
			for (DeliverReceiptPO po : upl) {
				if (po.getNameOfCourier().equals(dp.getNameOfCourier())) {
					a = dp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("DeliverReceipt.file");
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

	public void changeDeliverReceipt(DeliverReceiptPO dp1, DeliverReceiptPO dp2) {

		removeDeliverReceipt(dp1);
		addDeliverReceipt(dp2);
	}

	public ArrayList<DeliverReceiptPO> getDeliverReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("DeliverReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliverReceiptPO> upl = (ArrayList<DeliverReceiptPO>) ois.readObject();
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
