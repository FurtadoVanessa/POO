public class Triangulo extends Poligono {

    public double area ( ){
        return (altura*largura)/2;
    }

    public Triangulo(int nlados, int a, int l){
        this.largura = l;
        this.altura = a;
        this.setNumLados(nlados);
    }
}
