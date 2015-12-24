package data.stratedarddata.strategydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.stratedardPO.StrategyPO;

@SuppressWarnings("serial")
public class StrategyList implements Serializable {
	public StrategyPO getStrategyPO(String name) {
		try {
			FileInputStream fis = new FileInputStream("Strategy.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StrategyPO> upl = (ArrayList<StrategyPO>) ois.readObject();
			for (@SuppressWarnings("unused")
			StrategyPO po : upl) {
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
	public void addStrategy(StrategyPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Strategy.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<StrategyPO> upl = (ArrayList<StrategyPO>) ois.readObject();
			upl.add(sp);
			FileOutputStream fs = new FileOutputStream("Strategy.file");
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

	public void removeStrategy(StrategyPO sp) {
		try {
			FileInputStream fis = new FileInputStream("Strategy.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StrategyPO> upl = (ArrayList<StrategyPO>) ois.readObject();
			StrategyPO a = null;
			for (@SuppressWarnings("unused")
			StrategyPO po : upl) {
				// if (po.getName().equals(sp.getName())) {
				// a = sp;
				// }
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Strategy.file");
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

	public void changeStrategy(StrategyPO sp) {

		removeStrategy(sp);
		addStrategy(sp);
	}

	public ArrayList<StrategyPO> getStrategyList() {
		try {
			FileInputStream fis = new FileInputStream("Strategy.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<StrategyPO> upl = (ArrayList<StrategyPO>) ois.readObject();
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
