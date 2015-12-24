package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String[] args){
		try{
			IMessage msg = new MessageImpl();
			Registry registry = LocateRegistry.createRegistry(32000);
			registry.rebind("message", msg);
		}catch(RemoteException e){
			e.printStackTrace();
		}
	}

}
