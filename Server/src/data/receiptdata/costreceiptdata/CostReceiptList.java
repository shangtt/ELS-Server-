package data.receiptdata.costreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.CostReceiptPO;

@SuppressWarnings("serial")
public class CostReceiptList implements Serializable {
	public CostReceiptPO getCostReceiptPO(String account) {
		try {
			FileInputStream fis = new FileInputStream("CostReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostReceiptPO> upl = (ArrayList<CostReceiptPO>) ois.readObject();
			for (CostReceiptPO po : upl) {
				if (po.getAccount().equals(account)) {
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
	public void addCostReceipt(CostReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CostReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CostReceiptPO> upl = (ArrayList<CostReceiptPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("CostReceipt.file");
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

	public void removeCostReceipt(CostReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CostReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostReceiptPO> upl = (ArrayList<CostReceiptPO>) ois.readObject();
			CostReceiptPO a = null;
			for (CostReceiptPO po : upl) {
				if (po.getAccount().equals(cp.getAccount())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("CostReceipt.file");
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

	public void changeCostReceipt(CostReceiptPO cp1, CostReceiptPO cp2) {

		removeCostReceipt(cp1);
		addCostReceipt(cp2);
	}

	public ArrayList<CostReceiptPO> getCostReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("CostReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CostReceiptPO> upl = (ArrayList<CostReceiptPO>) ois.readObject();
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
