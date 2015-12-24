package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
//远程端口的实现

public class MessageImpl extends UnicastRemoteObject implements IMessage{

	private static final long serialVersionUID = 1L;

	protected MessageImpl() throws RemoteException{
		super();
	}
	//@override

	public String echo(String msg)throws IllegalArgumentException{
		if (msg == null) {
			throw new IllegalArgumentException();
		}
		return msg;
	}
	
}