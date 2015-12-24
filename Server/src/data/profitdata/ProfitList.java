package data.profitdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.profitPO.ProfitPO;

@SuppressWarnings("serial")
public class ProfitList implements Serializable {
	public ProfitPO getProfitPO(String name) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			for (@SuppressWarnings("unused")
			ProfitPO po : upl) {
				// if (po.getName().equals(name)) {
				// return po;
				// }
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
	public void addProfit(ProfitPO pp) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			upl.add(pp);
			FileOutputStream fs = new FileOutputStream("Profit.file");
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

	public void removeProfit(ProfitPO pp) {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
			ProfitPO a = null;
			for (@SuppressWarnings("unused")
			ProfitPO po : upl) {
				// if (po.getName().equals(pp.getName())) {
				// a = pp;
				// }
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Profit.file");
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

	public void changeAccount(ProfitPO pp) {

		removeProfit(pp);
		addProfit(pp);
	}

	public ArrayList<ProfitPO> getProfitList() {
		try {
			FileInputStream fis = new FileInputStream("Profit.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ProfitPO> upl = (ArrayList<ProfitPO>) ois.readObject();
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
