package data.infodata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.infoPO.DriverPO;

@SuppressWarnings("serial")
public class DriverList implements Serializable{
	public void addDriver(DriverPO po){
		try {
			FileInputStream fis=new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl=(ArrayList<DriverPO>) ois.readObject();
			dpl.add(po);
			FileOutputStream fs=new FileOutputStream("Driver.file");
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
	public void removeDriver(DriverPO po){
		try {
			FileInputStream fis=new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl=(ArrayList<DriverPO>) ois.readObject();
			DriverPO a=new DriverPO();
			for(DriverPO dp:dpl){
				if(dp.getIDCode().equals(po.getIDCode()))
						a=dp;
			}
			dpl.remove(a);
			FileOutputStream fs=new FileOutputStream("Driver.file");
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
	public void changeDriver(DriverPO po){
		removeDriver(po);
		addDriver(po);
	}
	public DriverPO getDriver(DriverPO po){
		try {
			FileInputStream fis=new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl=(ArrayList<DriverPO>) ois.readObject();
			for(DriverPO dp:dpl){
				if(dp.getIDCode().equals(po.getIDCode()))
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
	public ArrayList<DriverPO> getDriverList(){
		try {
			FileInputStream fis=new FileInputStream("Driver.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<DriverPO> dpl=(ArrayList<DriverPO>) ois.readObject();
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
		DriverList dl=new DriverList();
//		DriverPO po=new DriverPO();
//		po.setIDCode("999");
//		dl.removeDriver(po);
		ArrayList<DriverPO>a=dl.getDriverList();
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i).getIDCode());
		}
	}
}
