package Client;

import Server.IReverseFactory;
import Server.IReverseObject;
import java.rmi.*;
public class client {
    public client(String[] args) {
        if(System.getSecurityManager() == null) System.setSecurityManager(new RMISecurityManager());
        try{

            IReverseFactory fact = (IReverseFactory) Naming.lookup("rmi://localhost:1099/DynReverser");
            IReverseObject<Object> obj = fact.DoReverse(args[0]);
            System.out.println(obj.reverse());
        }
        catch(Exception e){
            System.out.println("error connecting to server");
            e.printStackTrace();
        }
    }
}
