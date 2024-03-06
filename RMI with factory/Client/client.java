package Client;

import Server.IReverseFactory;
import Server.IReverseObject;
import java.rmi.*;
public class client {
    public static void main(String[] args) {
        try{
            IReverseFactory fact = (IReverseFactory) Naming.lookup("rmi://localhost:1099/Reverser");
            IReverseObject<Object> obj = fact.DoReverse("Hiiii workinng ?");
            System.out.println(obj.reverse());
        }
        catch(Exception e){
            System.out.println("error connecting to server");
            e.printStackTrace();
        }
    }
}
