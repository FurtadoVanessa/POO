package Dois;

import java.io.PrintStream;
import java.util.*;

public class Dois {

    public static void main (String[] args) {

       /* ContaCorrente c1 = new ContaCorrente(1,"Joao", 1000);
        ContaCorrente c2 = new ContaEspecial(2,"Maria", 5000);

        try {
            c1.depositar(-5);
        } catch (Negativo negativo) {
            System.out.println(negativo.getMessage());
        }

        PrintStream saida = System.out;
        saida.println("ola");

        try{
            c1.sacar(-1000);
        }catch (SemSaldo s){
            System.out.println(s.getMessage());
        }catch (Exception n){
            System.out.println(n.getMessage());
        }

        try{
            c1.sacar(100);
            System.out.println("Novo saldo: "+c1.getSaldo());
        }catch (SemSaldo s){
            System.out.println(s.getMessage());
        }catch (Negativo n){
            System.out.println(n.getMessage());
        }

        try {
            c2.sacar(5000);
        } catch (SemSaldo semSaldo) {
            System.out.println(semSaldo.getMessage());
        } catch (Negativo negativo) {
            System.out.println(negativo.getMessage());
        }

        try {
            c2.sacar(500);
            System.out.println("Novo saldo: "+c2.getSaldo());
        } catch (SemSaldo semSaldo) {
            System.out.println(semSaldo.getMessage());
        } catch (Negativo negativo) {
            System.out.println(negativo.getMessage());
        }


*/


       HashMap a = new HashMap();
       a.put("a", "abacate");
       a.put("b", "banana");

        System.out.println(a.get("a").hashCode());

        Integer x1 = new Integer(10);
        Integer x2 = new Integer(11);

        int c = 10;
        int b = 10;

        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());

        if (x1.equals(x2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }
    }
}

