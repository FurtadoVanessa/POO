package Onze.Onze;

import java.util.ArrayList;

public class Onze {


    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.remove(2);
    }
}

//é gerado OutOfBoundsException, pois não há valor na posição 2 da lista
