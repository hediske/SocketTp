package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseString  extends UnicastRemoteObject implements  IReverseObject<String> {
    String inputString;
    
    ReverseString(String str) throws RemoteException {
        super();
        this.inputString=str;
    }
    @Override
    public String reverse() throws RemoteException {
        return new StringBuilder(inputString).reverse().toString();
    }
}
