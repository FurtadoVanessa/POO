public abstract class Item {

    private String titulo;
    private double preco;
    private int numeroEstoque;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroEstoque() {
        return numeroEstoque;
    }

    public void setNumeroEstoque(int numeroEstoque) {
        this.numeroEstoque = numeroEstoque;
    }
}
