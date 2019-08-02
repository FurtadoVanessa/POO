package Controller;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LerMemoriaPrincipal {



    private HashMap<Integer, String> memoriaPrincipal;

    public LerMemoriaPrincipal(String path){

        this.memoriaPrincipal = new HashMap<>();

        FileReader arq = null;
        try {
            arq = new FileReader(path);

            BufferedReader lerArq = new BufferedReader(arq);
            String linha = null;
            linha = lerArq.readLine();
            String split[];
            while (linha != null) {
                split = linha.split(" ");
                int key = Integer.parseInt(split[0].trim(),2);
                memoriaPrincipal.put(key, split[1].trim());
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


    public HashMap memoriaPrincipal(){
        return this.memoriaPrincipal;
    }
}
