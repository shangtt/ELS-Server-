package data.transitdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.transitPO.LoadPO;

@SuppressWarnings("serial")
public class LoadList implements Serializable {
	public void addLoad(LoadPO po){
		try {
			FileInputStream fis=new FileInputStream("Load.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadPO> lpl=(ArrayList<LoadPO>) ois.readObject();
			lpl.add(po);
			FileOutputStream fs=new FileOutputStream("Load.file");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(lpl);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void removeLoad(LoadPO po){
		try {
			FileInputStream fis=new FileInputStream("Load.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadPO> lpl=(ArrayList<LoadPO>) ois.readObject();
			LoadPO a=new LoadPO();
			for(LoadPO dp:lpl){
				if(dp.getID().equals(po.getID()))
						a=dp;
			}
			lpl.remove(a);
			FileOutputStream fs=new FileOutputStream("Load.file");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(lpl);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void changeLoad(LoadPO po){
		removeLoad(po);
		addLoad(po);
	}
	public LoadPO getLoad(LoadPO po){
		try {
			FileInputStream fis=new FileInputStream("Load.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadPO> lpl=(ArrayList<LoadPO>) ois.readObject();
			for(LoadPO lp:lpl){
				if(lp.getID().equals(po.getID()))
						return lp;
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
	public ArrayList<LoadPO> getLoadList(){
		try {
			FileInputStream fis=new FileInputStream("Load.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadPO> lpl=(ArrayList<LoadPO>) ois.readObject();
			return lpl;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args){
		try {
			FileInputStream fis =new FileInputStream("Load.file");
			ObjectInputStream ois=new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<LoadPO> upl =(ArrayList<LoadPO>) ois.readObject();
			for(LoadPO po:upl){
				System.out.println(po.getID());
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
