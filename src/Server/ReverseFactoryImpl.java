package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReverseFactoryImpl extends UnicastRemoteObject implements IReverseFactory  {
    protected ReverseFactoryImpl() throws RemoteException {
        super();
    }

    @SuppressWarnings("unchecked")
    public <T> IReverseObject<T> DoReverse(Object Object) throws RemoteException {
        if  (Object instanceof String )
           return (IReverseObject<T>) new ReverseString((String) Object);
        return null;
}
}
