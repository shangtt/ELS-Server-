package data.infodata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.infoPO.VehiclePO;

@SuppressWarnings("serial")
public class VehicleList implements Serializable {
	@SuppressWarnings("unchecked")
	public VehiclePO getVehicle(VehiclePO vp) {
		try {
			FileInputStream fis = new FileInputStream("Vehicle.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<VehiclePO> vpl = (ArrayList<VehiclePO>) ois.readObject();
			for (VehiclePO po : vpl) {
				if (po.getCode().equals(vp.getCode()))
					return po;
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

	public void addVehicle(VehiclePO vp) {
		try {
			FileInputStream fis = new FileInputStream("Vehicle.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<VehiclePO> vpl = (ArrayList<VehiclePO>) ois.readObject();
			vpl.add(vp);
			FileOutputStream fs = new FileOutputStream("Vehicle.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(vpl);
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

	public void removeVehicle(VehiclePO vp) {
		try {
			FileInputStream fis = new FileInputStream("Vehicle.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<VehiclePO> vpl = (ArrayList<VehiclePO>) ois.readObject();
			VehiclePO a = new VehiclePO();
			for (VehiclePO po : vpl) {
				if (po.getCode().equals(vp.getCode()))
					a = po;
			}
			vpl.remove(a);
			FileOutputStream fs = new FileOutputStream("Vehicle.file");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(vpl);
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

	public void changeVehicle(VehiclePO vp1, VehiclePO vp2) {
		removeVehicle(vp1);
		addVehicle(vp2);
	}

	public ArrayList<VehiclePO> getVehicleList() {
		try {
			FileInputStream fis = new FileInputStream("Vehicle.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<VehiclePO> vpl = (ArrayList<VehiclePO>) ois.readObject();
			return vpl;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		VehicleList vl = new VehicleList();
		// VehiclePO po=new VehiclePO();
		// po.setCode("025000110");
		// vl.removeVehicle(po);
		ArrayList<VehiclePO> a = vl.getVehicleList();
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i).getCode());
		}
		// try {
		// FileInputStream fis=new FileInputStream("Vehicle.file");
		// @SuppressWarnings("resource")
		// ObjectInputStream ois=new ObjectInputStream(fis);
		// @SuppressWarnings("unchecked")
		// ArrayList<VehiclePO> vpl=(ArrayList<VehiclePO>) ois.readObject();
		// for(VehiclePO po:vpl){
		// System.out.println(po.getCode());
		// }
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
