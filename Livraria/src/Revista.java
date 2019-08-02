public class Revista extends Item{

    private String ano;
    private int numero;

    public Revista(String nome, double preco, String ano, int numero){
        this.ano = ano;
        this.numero = numero;
        this.setPreco(preco);
        this.setTitulo(nome);

    }
}
