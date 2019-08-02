public class Triangulo {

    private Ponto vertice1;
    private Ponto vertice2;
    private Ponto vertice3;

    public Triangulo(Ponto v1, Ponto v2, Ponto v3){

        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
    }

    public double getPerimetro(){
        return getDistancia(this.vertice1, this.vertice2)+getDistancia(this.vertice2, this.vertice3)+getDistancia(this.vertice3, this.vertice1);
    }

    private double getDistancia(Ponto ponto1, Ponto ponto2){
        return Math.sqrt((ponto2.getX()-ponto1.getX())+(ponto2.getY()-ponto1.getY()));
    }

}
