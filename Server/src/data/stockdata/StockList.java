package data.stockdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.stockPO.StockPO;

@SuppressWarnings("serial")
public class StockList implements Serializable {
	public StockPO getStockPO(String orderID) {
		try {
			FileInputStream fis = new FileInputStream("Stock.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockPO> upl = (ArrayList<StockPO>) ois.readObject();
			for (StockPO po : upl) {
				if (po.getOrderID().equals(orderID)) {
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
	public void addStock(StockPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Stock.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<StockPO> upl = (ArrayList<StockPO>) ois.readObject();
			upl.add(sp);
			FileOutputStream fs = new FileOutputStream("Stock.file");
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

	public void removeStock(StockPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Stock.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockPO> upl = (ArrayList<StockPO>) ois.readObject();
			StockPO a = null;
			for (StockPO po : upl) {
				if (po.getOrderID().equals(sp.getOrderID())) {
					a = sp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Stockfile");
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

	public void changeStock(StockPO sp1, StockPO sp2) {

		removeStock(sp1);
		addStock(sp2);
	}

	public ArrayList<StockPO> getStockist() {
		try {
			FileInputStream fis = new FileInputStream("Stock.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StockPO> upl = (ArrayList<StockPO>) ois.readObject();
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
