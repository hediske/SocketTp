package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReverseFactory extends Remote  {
    <T> IReverseObject<T> DoReverse(Object Object) throws RemoteException;
    
}