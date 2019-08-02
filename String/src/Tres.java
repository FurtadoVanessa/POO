import java.util.Scanner;

public class Tres {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String usuario = sc.nextLine();
        String nomes[] = usuario.split(" ");


        for(int i=0; i<nomes.length; i++){
            if(nomes[i].length()>3)
                System.out.print(nomes[i].toUpperCase().charAt(0));
        }
    }
}
