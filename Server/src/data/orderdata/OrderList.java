package data.orderdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.orderPO.OrderPO;

@SuppressWarnings("serial")
public class OrderList implements Serializable {

	@SuppressWarnings("resource")
	public OrderPO getOrderPO(OrderPO op) {
		try {
			FileInputStream fis = new FileInputStream("Order.file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OrderPO> opl = (ArrayList<OrderPO>) ois.readObject();
			for (OrderPO po : opl) {
				if (po.getID().equals(op.getID())) {
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

	public void addOrder(OrderPO op) {
		try {
			FileInputStream fis = new FileInputStream("Order.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OrderPO> upl = (ArrayList<OrderPO>) ois.readObject();
			upl.add(op);
			FileOutputStream fs = new FileOutputStream("Order.file");
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

	public void removeOrder(OrderPO op) {
		try {
			FileInputStream fis = new FileInputStream("Order.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OrderPO> opl = (ArrayList<OrderPO>) ois.readObject();
			OrderPO a = null;
			for (OrderPO po : opl) {
				if (po.getID() == po.getID()) {
					a = po;
				}
			}
			opl.remove(a);
			FileOutputStream fs = new FileOutputStream("order.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(opl);
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

	public void changeOrder(OrderPO op1, OrderPO op2) {

		removeOrder(op1);
		addOrder(op2);
	}

	public ArrayList<OrderPO> getOrderList() {
		try {
			FileInputStream fis = new FileInputStream("Order.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OrderPO> opl = (ArrayList<OrderPO>) ois.readObject();
			return opl;
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

		try {
			FileInputStream fis = new FileInputStream("Order.file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<OrderPO> upl = (ArrayList<OrderPO>) ois.readObject();
			for (OrderPO po : upl) {
				System.out.println(po.getSize() + " " + po.getWeight() + po.getTypeOfExpress() + po.getTypeOfPack()
						+ po.getStateOfExpress() + po.getID());
			}
			ois.close();
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

}
