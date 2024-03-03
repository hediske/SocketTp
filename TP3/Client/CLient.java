package TP3.Client;

import java.rmi.Naming;
import java.util.Scanner;

import TP3.Server.ArithOpImpl;

public class CLient {
    public static void main (String args[]){
        try{
            ArithOpImpl mediator = (ArithOpImpl) Naming.lookup("rmi://localhost:1099/AithmeticOperations");
            Scanner scanner = new Scanner (System.in);
            while (true) {
                System.out.println("Donner l'opperateur");
                char operateur =scanner.nextLine().charAt(0);
                if(operateur !='+' && operateur  !='*' && operateur !='/' && operateur !='-'){
                    System.out.println("program terminated");
                    return;
                }
                System.out.println("Donner l'opperande 1");
                double operande1 =Double.parseDouble(scanner.nextLine());
                System.out.println("Donner l'opperande 2");
                double operande2 =Double.parseDouble(scanner.nextLine());
                switch(operateur){
                    case '+' ->System.out.println("Resultat   :  "+ mediator.addition(operande1, operande2));
                    case '*' ->System.out.println("Resultat   :  "+ mediator.multiplication(operande1, operande2));
                    case '/' ->System.out.println("Resultat   :  "+ mediator.division(operande1, operande2));
                    case '-' ->System.out.println("Resultat   :  "+ mediator.soustraction(operande1, operande2));
                    
                }
            }
            
        }
        catch (Exception e) {
            System.out.println ("Erreur d'accés à l'objet distant.");
            System.out.println (e.toString());
        }
    }
    
}
