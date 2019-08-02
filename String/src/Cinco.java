import java.util.Scanner;

public class Cinco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String usuario = sc.nextLine();
        for(int i = 0; i<usuario.length(); i++){
            if(usuario.charAt(i)!=' '){
                System.out.print(usuario.charAt(i));
            }
        }
    }

}
