public class Teste {


    public static void main(String[] args){

        Poligono p1 = new Triangulo(3, 2, 2);
        Poligono p2 = new Retangulo(4,2,2);

        System.out.println(p1.area());
        System.out.println(p2.area());
    }
}
