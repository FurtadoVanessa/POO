package Dois;

public class SemSaldo extends Exception{


    public SemSaldo(){
    }

    public String getMessage(){
        return "Erro ao sacar. Saldo insuficiente";
    }
}