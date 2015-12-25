package data.receiptdata.transferreceiptdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.receiptPO.TransferReceiptPO;

@SuppressWarnings("serial")
public class TransferReceiptList implements Serializable {
	public TransferReceiptPO getTransferReceiptPO(String flight) {
		try {
			FileInputStream fis = new FileInputStream("TransferReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransferReceiptPO> upl = (ArrayList<TransferReceiptPO>) ois.readObject();
			for (TransferReceiptPO po : upl) {
				if (po.getFlight().equals(flight)) {
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
	public void addTransferReceipt(TransferReceiptPO tp) {
		try {
			FileInputStream fis = new FileInputStream("TransferReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<TransferReceiptPO> upl = (ArrayList<TransferReceiptPO>) ois.readObject();
			upl.add(tp);
			FileOutputStream fs = new FileOutputStream("TransferReceipt.file");
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

	public void removeTransferReceipt(TransferReceiptPO tp) {
		try {
			FileInputStream fis = new FileInputStream("TransferReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransferReceiptPO> upl = (ArrayList<TransferReceiptPO>) ois.readObject();
			TransferReceiptPO a = null;
			for (TransferReceiptPO po : upl) {
				if (po.getFlight().equals(tp.getFlight())) {
					a = tp;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("TransferReceipt.file");
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

	public void changeTransferReceipt(TransferReceiptPO tp1, TransferReceiptPO tp2) {

		removeTransferReceipt(tp1);
		addTransferReceipt(tp2);
	}

	public ArrayList<TransferReceiptPO> getTransferReceiptList() {
		try {
			FileInputStream fis = new FileInputStream("TransferReceipt.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<TransferReceiptPO> upl = (ArrayList<TransferReceiptPO>) ois.readObject();
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
