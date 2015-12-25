package data.receiptdata.centraarrivalreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.CentraArrivalReceiptPO;

@SuppressWarnings("serial")
public class CentraArrivalReceiptList implements Serializable {
	public CentraArrivalReceiptPO getCentraArrivalReceiptPO(String centraCode) {
		try {
			FileInputStream fis = new FileInputStream("CentraArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CentraArrivalReceiptPO> upl = (ArrayList<CentraArrivalReceiptPO>) ois.readObject();
			for (CentraArrivalReceiptPO po : upl) {
				if (po.getCentraCode().equals(centraCode)) {
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
	public void addCentraArrivalReceipt(CentraArrivalReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CentraArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<CentraArrivalReceiptPO> upl = (ArrayList<CentraArrivalReceiptPO>) ois.readObject();
			upl.add(cp);
			FileOutputStream fs = new FileOutputStream("CentraArrivalReceipt.file");
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

	public void removeCentraArrivalReceipt(CentraArrivalReceiptPO cp) {
		try {
			FileInputStream fis = new FileInputStream("CentraArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CentraArrivalReceiptPO> upl = (ArrayList<CentraArrivalReceiptPO>) ois.readObject();
			CentraArrivalReceiptPO a = null;
			for (CentraArrivalReceiptPO po : upl) {
				if (po.getCentraCode().equals(cp.getCentraCode())) {
					a = cp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("CentraArrivalReceipt.file");
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

	public void changeCentraArrivalReceipt(CentraArrivalReceiptPO cp1, CentraArrivalReceiptPO cp2) {

		removeCentraArrivalReceipt(cp1);
		addCentraArrivalReceipt(cp2);
	}

	public ArrayList<CentraArrivalReceiptPO> getCentraArrivalReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("CentraArrivalReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<CentraArrivalReceiptPO> upl = (ArrayList<CentraArrivalReceiptPO>) ois.readObject();
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
