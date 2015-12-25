package data.receiptdata.stockindata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.StockInPO;

@SuppressWarnings("serial")
public class StockInList implements Serializable {
	public StockInPO getCostReceiptPO(String arrival) {
		try {
			FileInputStream fis = new FileInputStream("StockIn.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockInPO> upl = (ArrayList<StockInPO>) ois.readObject();
			for (StockInPO po : upl) {
				if (po.getArrival().equals(arrival)) {
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
	public void addStockIn(StockInPO sp) {
		try {
			FileInputStream fis = new FileInputStream("StockIn.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<StockInPO> upl = (ArrayList<StockInPO>) ois.readObject();
			upl.add(sp);
			FileOutputStream fs = new FileOutputStream("StockIn.file");
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

	public void removeStockIn(StockInPO sp) {
		try {
			FileInputStream fis = new FileInputStream("StockIn.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockInPO> upl = (ArrayList<StockInPO>) ois.readObject();
			StockInPO a = null;
			for (StockInPO po : upl) {
				if (po.getArrival().equals(sp.getArrival())) {
					a = sp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("StockIn.file");
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

	public void changeCostReceipt(StockInPO sp1, StockInPO sp2) {

		removeStockIn(sp1);
		addStockIn(sp2);
	}

	public ArrayList<StockInPO> getStockInList() {
		try {
			FileInputStream fis = new FileInputStream("StockIn.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockInPO> upl = (ArrayList<StockInPO>) ois.readObject();
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
