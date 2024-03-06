package Server;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
public class Server {
	public static void main(String[] args) {
        try{
            System.out.println("creating server");
            ReverseFactoryImpl reverseFact = new ReverseFactoryImpl();
            System.out.println("Factory created");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("Reverser", reverseFact);
        }catch(Exception e){
            e.printStackTrace();
        }
	} 
} 
