package TP3.Server;

import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try{
            ArithOpImpl mediator = new ArithOpImpl();
            System.out.println("server running !! ");
            Naming.bind("AithmeticOperations", mediator);
            System.out.println("waiting for clients");
        }
        catch(Exception e){

        }
    }
}
