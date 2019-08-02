import java.util.Scanner;

public class Main {

    public static void Main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite o primeiro ponto (X, Y)");
        x = sc.nextInt();
        y = sc.nextInt();
        Ponto p1 = new Ponto(x, y);
        System.out.println("Digite o segundo ponto (X, Y)");
        x = sc.nextInt();
        y = sc.nextInt();
        Ponto p2 = new Ponto(x, y);
        System.out.println("Digite o terceiro ponto (X, Y)");
        x = sc.nextInt();
        y = sc.nextInt();
        Ponto p3 = new Ponto(x, y);
        Triangulo tri = new Triangulo(p1, p2, p3);
        System.out.println("O perimetro é "+tri.getPerimetro());

    }
}
