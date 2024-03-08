package Server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMIClassLoader;
import java.util.Properties;
public class DynamicServer {
	public static void main(String[] args) {
        if(System.getSecurityManager() == null) System.setSecurityManager(new RMISecurityManager());//deprecated in java 17 and above ! -> ssl or other custom policy
        try{
            System.out.println("creating server");
            ReverseFactoryImpl reverseFact = new ReverseFactoryImpl();
            System.out.println("Factory created");
            LocateRegistry.createRegistry(1099);
            Properties p =System.getProperties();
            String url=p.getProperty("java.rmi.server.codebase");
            Class<?> ClassServer =RMIClassLoader.loadClass(url,"ReverseFactoryImpl");
            Naming.rebind("DynReverser",(Remote)ClassServer.getDeclaredConstructor().newInstance());
        }catch(Exception e){
            e.printStackTrace();
        }
	} 
} 
