package data.accountdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import po.accountPO.AccountPO;

@SuppressWarnings("serial")
public class AccountList implements Serializable {
	public AccountPO getAccountPO(String name) {
		try {
			FileInputStream fis = new FileInputStream("Account.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AccountPO> upl = (ArrayList<AccountPO>) ois.readObject();
			for (AccountPO po : upl) {
				if (po.getName().equals(name)) {
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
	public void addAccount(AccountPO ap) {
		try {
			FileInputStream fis = new FileInputStream("Account.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<AccountPO> upl = (ArrayList<AccountPO>) ois.readObject();
			upl.add(ap);
			FileOutputStream fs = new FileOutputStream("Account.file");
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

	public void removeAccount(AccountPO ap) {
		try {
			FileInputStream fis = new FileInputStream("Account.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AccountPO> upl = (ArrayList<AccountPO>) ois.readObject();
			AccountPO a = null;
			for (AccountPO po : upl) {
				if (po.getName().equals(ap.getName())) {
					a = ap;
				}
			}
			upl.remove(a);
			FileOutputStream fs = new FileOutputStream("Account.file");
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

	public void changeAccount(AccountPO ap1, AccountPO ap2) {

		removeAccount(ap1);
		addAccount(ap2);
	}

	public ArrayList<AccountPO> getAccountList() {
		try {
			FileInputStream fis = new FileInputStream("Account.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AccountPO> upl = (ArrayList<AccountPO>) ois.readObject();
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

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("Account.file");
			@SuppressWarnings("resource")
			ObjectInputStream ois = new ObjectInputStream(fis);
			@SuppressWarnings("unchecked")
			ArrayList<AccountPO> upl = (ArrayList<AccountPO>) ois.readObject();
			for (AccountPO po : upl) {
				System.out.println(po.getName() + po.getBalance());
			}
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
