package TP3.Server;

import java.rmi.Remote;

public interface IArithOp extends Remote{
    double addition(double a , double b );
    double soustraction(double a, double b);
    double division(double a ,double b);
    double multiplication(double a, double b);    
}