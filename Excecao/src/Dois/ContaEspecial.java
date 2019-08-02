package Dois;

public class ContaEspecial extends ContaCorrente {

    ContaEspecial(int numero, String nome, int saldo){
        this.nome = nome;
        this.numero = numero;
        this.setSaldo(saldo);
    }

    public void sacar(double valor) throws SemSaldo, Negativo{
        if(valor<0)
            throw new Negativo("valor negativo a ser sacado");
        else if((this.getSaldo()-(valor*1.001)>0)){
            this.setSaldo(this.getSaldo() - (valor*1.001));
        }else{
            throw new SemSaldo();
        }
    }
}
