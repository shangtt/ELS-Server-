package data.agencydata.agencydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.agencyPO.AgencyPO;

@SuppressWarnings("serial")
public class AgencyList implements Serializable {
	public AgencyPO getAgencyPO(String id) {
		try {
			FileInputStream fis = new FileInputStream("Agency.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AgencyPO> upl = (ArrayList<AgencyPO>) ois.readObject();
			for (AgencyPO po : upl) {
				if (po.getID().equals(id)) {
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
	public void addAgency(AgencyPO ap) {
		try {
			FileInputStream fis = new FileInputStream("Agency.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<AgencyPO> upl = (ArrayList<AgencyPO>) ois.readObject();
			upl.add(ap);
			FileOutputStream fs = new FileOutputStream("Agency.file");
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

	public void removeAgency(AgencyPO ap) {
		try {
			FileInputStream fis = new FileInputStream("Agency.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AgencyPO> upl = (ArrayList<AgencyPO>) ois.readObject();
			AgencyPO a = null;
			for (AgencyPO po : upl) {
				if (po.getID().equals(ap.getID())) {
					a = ap;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Agency.file");
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

	public void changeAgency(AgencyPO ap) {

		removeAgency(ap);
		addAgency(ap);
	}

	public ArrayList<AgencyPO> getAgencyList() {
		try {
			FileInputStream fis = new FileInputStream("Agency.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AgencyPO> upl = (ArrayList<AgencyPO>) ois.readObject();
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
