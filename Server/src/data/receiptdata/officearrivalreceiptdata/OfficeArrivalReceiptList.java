package data.receiptdata.officearrivalreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.OfficeArrivalReceiptPO;

@SuppressWarnings("serial")
public class OfficeArrivalReceiptList implements Serializable {
	public OfficeArrivalReceiptPO getOfficeArrivalReceiptPO(String Departure) {
		try {
			FileInputStream fis = new FileInputStream("OfficeArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OfficeArrivalReceiptPO> upl = (ArrayList<OfficeArrivalReceiptPO>) ois.readObject();
			for (OfficeArrivalReceiptPO po : upl) {
				if (po.getDeparture().equals(Departure)) {
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
	public void addOfficeArrivalReceipt(OfficeArrivalReceiptPO op) {
		try {
			FileInputStream fis = new FileInputStream("OfficeArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<OfficeArrivalReceiptPO> upl = (ArrayList<OfficeArrivalReceiptPO>) ois.readObject();
			upl.add(op);
			FileOutputStream fs = new FileOutputStream("OfficeArrivalReceipt.file");
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

	public void removeOfficeArrivalReceipt(OfficeArrivalReceiptPO op) {
		try {
			FileInputStream fis = new FileInputStream("OfficeArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OfficeArrivalReceiptPO> upl = (ArrayList<OfficeArrivalReceiptPO>) ois.readObject();
			OfficeArrivalReceiptPO a = null;
			for (OfficeArrivalReceiptPO po : upl) {
				if (po.getDeparture().equals(op.getDeparture())) {
					a = op;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("OfficeArrivalReceipt.file");
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

	public void changeOfficeArrivalReceipt(OfficeArrivalReceiptPO op1, OfficeArrivalReceiptPO op2) {

		removeOfficeArrivalReceipt(op1);
		addOfficeArrivalReceipt(op2);
	}

	public ArrayList<OfficeArrivalReceiptPO> getOfficeArrivalReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("OfficeArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OfficeArrivalReceiptPO> upl = (ArrayList<OfficeArrivalReceiptPO>) ois.readObject();
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
