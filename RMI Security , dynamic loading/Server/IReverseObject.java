package Server;

import java.rmi.Remote;
import java.rmi.*;
public interface IReverseObject <T> extends Remote {
    
   T reverse() throws RemoteException;
}