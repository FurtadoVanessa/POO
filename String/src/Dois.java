import java.util.Scanner;

public class Dois {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usuario = sc.nextInt();
        String numero = String.valueOf(usuario);
        for(int i=0; i<numero.length(); i++){
            switch (numero.charAt(i)){
                case '0':
                    System.out.println("Zero ");
                    break;

                case '1':
                    System.out.println("Um ");
                    break;
                case '2':
                    System.out.println("Dois ");
                    break;
                case '3':
                    System.out.println("Tres ");
                    break;
                case '4':
                    System.out.println("Quatro ");
                    break;
                case '5':
                    System.out.println("Cinco ");
                    break;
                case '6':
                    System.out.println("Seis ");
                    break;
                case '7':
                    System.out.println("Sete ");
                    break;
                case '8':
                    System.out.println("Oito ");
                    break;
                case '9':
                    System.out.println("Nove ");
                    break;
            }
        }

    }

}
