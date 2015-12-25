package data.receiptdata.stockoutreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.StockOutReceiptPO;

@SuppressWarnings("serial")
public class StockOutReceiptList implements Serializable {
	public StockOutReceiptPO getStockOutReceiptPO(String transCode) {
		try {
			FileInputStream fis = new FileInputStream("StockOutReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockOutReceiptPO> upl = (ArrayList<StockOutReceiptPO>) ois.readObject();
			for (StockOutReceiptPO po : upl) {
				if (po.getTransCode().equals(transCode)) {
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
	public void addStockOutReceipt(StockOutReceiptPO sp) {
		try {
			FileInputStream fis = new FileInputStream("StockOutReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<StockOutReceiptPO> upl = (ArrayList<StockOutReceiptPO>) ois.readObject();
			upl.add(sp);
			FileOutputStream fs = new FileOutputStream("StockOutReceipt.file");
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

	public void removeStockOutReceipt(StockOutReceiptPO sp) {
		try {
			FileInputStream fis = new FileInputStream("StockOutReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockOutReceiptPO> upl = (ArrayList<StockOutReceiptPO>) ois.readObject();
			StockOutReceiptPO a = null;
			for (StockOutReceiptPO po : upl) {
				if (po.getTransCode().equals(sp.getTransCode())) {
					a = sp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("StockOutReceipt.file");
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

	public void changeCostReceipt(StockOutReceiptPO sp1, StockOutReceiptPO sp2) {

		removeStockOutReceipt(sp1);
		addStockOutReceipt(sp2);
	}

	public ArrayList<StockOutReceiptPO> getStockOutReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("StockOutReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockOutReceiptPO> upl = (ArrayList<StockOutReceiptPO>) ois.readObject();
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
