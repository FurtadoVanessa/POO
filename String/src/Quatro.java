import java.util.Scanner;

public class Quatro {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String usuario = sc.nextLine();
        String nomes[] = usuario.split(" ");

        System.out.println("Numero que caracteres: "+usuario.length());
        System.out.println("Numero de palavras: "+nomes.length);
    }
}
