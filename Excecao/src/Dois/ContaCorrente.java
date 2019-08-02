package Dois;

public class ContaCorrente {

    public int numero;
    public String nome;
    private double saldo;

    


    ContaCorrente(int numero, String nome, int saldo){
            this.nome = nome;
            this.numero = numero;
            this.saldo = saldo;
    }

    ContaCorrente(){}

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }


    public void sacar(double valor) throws SemSaldo, Negativo{
        if(valor<0)
            throw new Negativo("Valor negativo a ser sacado");
        else if((this.getSaldo()>=(valor*1.005))){
            this.saldo -= (valor*1.005);
        }else{
            throw new SemSaldo();
        }
    }
    public void deposita(double valor){
        if(valor>0)
            this.saldo+= valor;
//        else
//            throw new Negativo("Valor negativo a ser depositado");
    }
}
