
public class Livro extends Item{

    private String autor;

    public Livro(String nome, double preco, String autor){
        this.autor = autor;
        this.setPreco(preco);
        this.setTitulo(nome);
    }

}
