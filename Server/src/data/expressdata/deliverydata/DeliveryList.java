package data.expressdata.deliverydata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.expressPO.deliveryPO.DeliveryPO;

@SuppressWarnings("serial")
public class DeliveryList implements Serializable {

	public void addDelivery(DeliveryPO po) {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> dpl = (ArrayList<DeliveryPO>) ois.readObject();
			dpl.add(po);
			FileOutputStream fs = new FileOutputStream("Delivery.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(dpl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs = new FileOutputStream("Delivery.file");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				ArrayList<DeliveryPO> dpl = new ArrayList<DeliveryPO>();
				dpl.add(po);
				os.writeObject(dpl);
				os.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeDelivery(DeliveryPO po) {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> dpl = (ArrayList<DeliveryPO>) ois.readObject();
			DeliveryPO a = new DeliveryPO();
			for (DeliveryPO dp : dpl) {
				if (dp.getID().equals(po.getID()))
					a = dp;
			}
			dpl.remove(a);
			FileOutputStream fs = new FileOutputStream("Delivery.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(dpl);
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

	public void changeDriver(DeliveryPO po1, DeliveryPO po2) {
		removeDelivery(po1);
		addDelivery(po2);
	}

	public DeliveryPO getArrival(DeliveryPO po) {
		try {
			FileInputStream fis = new FileInputStream("Deliveryfile");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> dpl = (ArrayList<DeliveryPO>) ois.readObject();
			for (DeliveryPO dp : dpl) {
				if (dp.getID().equals(po.getID()))
					return dp;
			}
			return null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<DeliveryPO> getArrivalList() {
		try {
			FileInputStream fis = new FileInputStream("Delivery.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DeliveryPO> dpl = (ArrayList<DeliveryPO>) ois.readObject();
			return dpl;
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

	public static void main(String[] args) {
		DeliveryList dl = new DeliveryList();
		DeliveryPO po = new DeliveryPO();
		po.setID("999");
		po.setCourier("菜鸡");
		// dl.removeDriver(po);
		dl.addDelivery(po);
		ArrayList<DeliveryPO> a = dl.getArrivalList();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getID() + a.get(i).getCourier());
		}
	}
}
