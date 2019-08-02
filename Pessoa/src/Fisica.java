public class Fisica extends Pessoa {

    private String CPF;
    private String RG;

    public Fisica(String CPF, String RG, String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CPF = CPF;
        this.RG = RG;
    }
}
