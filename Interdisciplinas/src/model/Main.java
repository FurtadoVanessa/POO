import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {



    public static void main(String[] args){

        HashMap<String, String> memoria = new HashMap<>();


        Cache c = new Cache("1", "2", "3");
        Cache c2 = new Cache("4", "5", "6");

        memoria.put(c.getTag(),c.getLinha()+c.getIndex());

        memoria.put(c2.getTag(),c2.getLinha()+c2.getIndex());

        for(Map.Entry<String, String> a: memoria.entrySet()){
            System.out.println("Tem a chave "+a.getKey()+" com o valor: "+a.getValue());
        }

        LerConfig computador = new LerConfig("teste.txt");
        System.out.println(computador.getConfig());

        LerMemoriaPrincipal lerMemoriaPrincipal = new LerMemoriaPrincipal("teste2.txt");
        HashMap<Integer, String> principal = lerMemoriaPrincipal.memoriaPrincipal();
        for(Map.Entry<Integer, String> a: principal.entrySet()){
            System.out.println("Tem a chave "+a.getKey()+" com o valor: "+a.getValue());
        }


        LerInstrucoes instrucao = new LerInstrucoes("teste3.txt");
        List<String> store = instrucao.instrucoesStore();
        List<String> load = instrucao.instrucoesLoad();

        for(String a: store){
            System.out.println("Intrucao store com o valor: "+a);
        }


        for(String a: load){
            System.out.println("Intrucao load com o valor: "+a);
        }


    }
}
