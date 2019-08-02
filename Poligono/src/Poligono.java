public abstract class Poligono {

    private int numLados;
    protected double altura;
    protected double largura;


    public abstract double area ( );

    public void setNumLados(int n){
        this.numLados = n;
    }
}
