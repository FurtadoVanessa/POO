import java.io.*;
import java.nio.file.Path;

public class LerConfig {


    private int mem_pri_size;
    private int mem_pri_unid;
    private int mem_cache_size;
    private int mem_cache_unid;
    private int mem_cache_block;


    public LerConfig(String path){


        String vetor[] = new String[5];

        FileReader arq = null;
        try {
            arq = new FileReader(path);

            BufferedReader lerArq = new BufferedReader(arq);
            String linha = null;
            linha = lerArq.readLine();
            int i = 0;
            String split[];
            while (linha != null) {
                split = linha.split("=");
                vetor[i] = split[1].trim();
                linha = lerArq.readLine();
                i++;
            }
        }
             catch (FileNotFoundException e) {
                e.printStackTrace();
            }
                catch (IOException e) {
                 e.printStackTrace();
        }
        this.mem_pri_size = Integer.parseInt(vetor[0]);
        this.mem_pri_unid = converteUnidade(vetor[1]);
        this.mem_cache_size = Integer.parseInt(vetor[2]);
        this.mem_cache_unid = converteUnidade(vetor[3]);
        this.mem_cache_block = Integer.parseInt(vetor[4]);
    }

    public String getConfig(){
        String config = "Memoria principal: "+this.mem_pri_size+" unidade: "+this.mem_pri_unid+"" +
                "\n Memoria Cache: "+this.mem_cache_size+" unidade: "+this.mem_cache_unid+ "\n " +
                "bloco: "+this.mem_cache_block;
        return config;
    }


    public int getMem_pri_size() {
        return mem_pri_size;
    }

    public void setMem_pri_size(int mem_pri_size) {
        this.mem_pri_size = mem_pri_size;
    }

    public int getMem_pri_unid() {
        return mem_pri_unid;
    }

    public void setMem_pri_unid(int mem_pri_unid) {
        this.mem_pri_unid = mem_pri_unid;
    }

    public int getMem_cache_size() {
        return mem_cache_size;
    }

    public void setMem_cache_size(int mem_cache_size) {
        this.mem_cache_size = mem_cache_size;
    }

    public int getMem_cache_unid() {
        return mem_cache_unid;
    }

    public void setMem_cache_unid(int mem_cache_unid) {
        this.mem_cache_unid = mem_cache_unid;
    }

    public int getMem_cache_block() {
        return mem_cache_block;
    }

    public void setMem_cache_block(int mem_cache_block) {
        this.mem_cache_block = mem_cache_block;
    }


    public int converteUnidade(String unidade){

        unidade = unidade.toUpperCase();

        switch (unidade){

            case "KB":
                return 1024;
            case "MB":
                return 1048576;
            case "GB":
                return 1073741824;
        }
        return 1;
    }


    }

