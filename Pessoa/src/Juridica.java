public class Juridica extends Pessoa{

    private String CNPJ;
    private String InscricaoEstadual;


    public Juridica(String CNPJ, String InscricaoEstadual, String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.CNPJ = CNPJ;
        this.InscricaoEstadual = InscricaoEstadual;
    }

}
