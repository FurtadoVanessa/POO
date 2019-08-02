public class Retangulo extends Poligono{

    public double area ( ){
        return (altura*largura);
    }

    public Retangulo(int nlados, int a, int l){
        this.largura = l;
        this.altura = a;
        this.setNumLados(nlados);
    }
}
