package data.expressdata.arrivaldata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.expressPO.arrivalPO.ArrivalPO;

@SuppressWarnings("serial")
public class ArrivalList implements Serializable{
	public void addArrival(ArrivalPO po){
		try {
			FileInputStream fis=new FileInputStream("Arrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ArrivalPO> dpl=(ArrayList<ArrivalPO>) ois.readObject();
			dpl.add(po);
			FileOutputStream fs=new FileOutputStream("Arrival.file");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(dpl);
			os.close();
		} catch (FileNotFoundException e) {
			try {
				FileOutputStream fs=new FileOutputStream("Arrival.file");
				ObjectOutputStream os=new ObjectOutputStream(fs);
				ArrayList<ArrivalPO> dpl=new ArrayList<ArrivalPO>();
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
	public void removeArrival(ArrivalPO po){
		try {
			FileInputStream fis=new FileInputStream("Arrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ArrivalPO> dpl=(ArrayList<ArrivalPO>) ois.readObject();
			ArrivalPO a=new ArrivalPO();
			for(ArrivalPO dp:dpl){
				if(dp.getID().equals(po.getID()))
						a=dp;
			}
			dpl.remove(a);
			FileOutputStream fs=new FileOutputStream("Arrival.file");
			ObjectOutputStream os=new ObjectOutputStream(fs);
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
	public void changeArrival(ArrivalPO po){
		removeArrival(po);
		addArrival(po);
	}
	public ArrivalPO getArrival(ArrivalPO po){
		try {
			FileInputStream fis=new FileInputStream("Arrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ArrivalPO> dpl=(ArrayList<ArrivalPO>) ois.readObject();
			for(ArrivalPO dp:dpl){
				if(dp.getID().equals(po.getID()))
						return dp;
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
	
	public ArrayList<ArrivalPO> getArrivalList(){
		try {
			FileInputStream fis=new FileInputStream("Arrival.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<ArrivalPO> dpl=(ArrayList<ArrivalPO>) ois.readObject();
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
	public static void main(String[] args){
		ArrivalList dl=new ArrivalList();
		ArrivalPO po=new ArrivalPO();
		po.setID("999");
//		dl.removeDriver(po);
		dl.addArrival(po);
		ArrayList<ArrivalPO>a=dl.getArrivalList();
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i).getID());
		}
	}
}