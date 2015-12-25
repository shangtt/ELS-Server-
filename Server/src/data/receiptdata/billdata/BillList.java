package data.receiptdata.billdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.billPO.BillPO;

@SuppressWarnings("serial")
public class BillList implements Serializable {
	public BillPO getBillPO(String order) {
		try {
			FileInputStream fis = new FileInputStream("Bill.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<BillPO> upl = (ArrayList<BillPO>) ois.readObject();
			for (BillPO po : upl) {
				if (po.getOrder().equals(order)) {
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
	public void addBill(BillPO bp) {
		try {
			FileInputStream fis = new FileInputStream("Bill.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<BillPO> upl = (ArrayList<BillPO>) ois.readObject();
			upl.add(bp);
			FileOutputStream fs = new FileOutputStream("Bill.file");
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

	public void removeBill(BillPO bp) {
		try {
			FileInputStream fis = new FileInputStream("Bill.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<BillPO> upl = (ArrayList<BillPO>) ois.readObject();
			BillPO a = null;
			for (BillPO po : upl) {
				if (po.getOrder().equals(bp.getOrder())) {
					a = bp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Bill.file");
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

	public void changeBill(BillPO bp1, BillPO bp2) {

		removeBill(bp1);
		addBill(bp2);
	}

	public ArrayList<BillPO> getBillList() {
		try {
			FileInputStream fis = new FileInputStream("Bill.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<BillPO> upl = (ArrayList<BillPO>) ois.readObject();
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
