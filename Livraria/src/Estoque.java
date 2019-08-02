import java.sql.Date;

public class Estoque {

    public static void main(String[] args) {
        Item[] estoque = new Item[10];
        int quantidade = 0;
        int numero = 0;


        Item i1 = new Revista("Revista a", 10, "03/02/19", 25);
        i1.setNumeroEstoque(numero);
        numero++;
        Item i2 = new Revista("Revista b", 20, "03/05/19", 30);
        i2.setNumeroEstoque(numero);
        numero++;
        Item i3 = new Livro("Livro a", 5, "Jose");
        i3.setNumeroEstoque(numero);
        numero++;
        Item i4 = new Livro("Livro b", 10, "Maria");
        i4.setNumeroEstoque(numero);
        numero++;

        estoque[quantidade] = i1;
        quantidade++;
        estoque[quantidade] = i2;
        quantidade++;
        estoque[quantidade] = i3;
        quantidade++;
        estoque[quantidade] = i4;
        quantidade++;

        for(int i=0; i<quantidade; i++){
            System.out.println("Preco "+estoque[i].getPreco());
            System.out.println("Titulo "+estoque[i].getTitulo());
            System.out.println("Numero de estoque: "+estoque[i].getNumeroEstoque());
        }

    }


}
