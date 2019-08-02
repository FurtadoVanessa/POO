import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LerInstrucoes {


    private List<String> instrucoesStore;
    private List<String> instrucoesLoad;

    public LerInstrucoes(String path){

        this.instrucoesStore = new ArrayList<>();
        this.instrucoesLoad = new ArrayList<>();

        FileReader arq = null;
        try {
            arq = new FileReader(path);

            BufferedReader lerArq = new BufferedReader(arq);
            String linha = null;
            linha = lerArq.readLine();
            String split[];
            while (linha != null) {
                split = linha.split(" ");
                if(split[0].trim().compareToIgnoreCase("S")==0){
                    instrucoesStore.add(split[1].trim());
                }else{
                    instrucoesLoad.add(split[1].trim());
                }
                linha = lerArq.readLine();
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    public List<String> instrucoesStore(){
        return this.instrucoesStore;
    }


    public List<String> instrucoesLoad(){
        return this.instrucoesLoad;
    }
}
