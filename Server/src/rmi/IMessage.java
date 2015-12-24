package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
//服务器端的实现，编写一个远程端口
public interface IMessage extends Remote{
	public String echo(String msg)throws RemoteException,IllegalArgumentException;
}