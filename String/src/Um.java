import java.util.Scanner;

public class Um {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuario = sc.next();

        System.out.println("Numero de caracteres: " +usuario.length());
        System.out.println("Maiusculo: "+usuario.toUpperCase());
        System.out.println("Numero de vogais: "+numeroVogais(usuario));
        System.out.println("Começa com UNI: "+comecaCom(usuario));
        System.out.println("Termina com RIO: "+terminaCom(usuario));
        System.out.println("Numero de digitos: "+numeroDigitos(usuario));
        System.out.println("Palindromo: "+palindromo(usuario));

    }

    public static int numeroVogais(String s) {
        int quantidade=0;
        for(int i=0; i<s.length(); i++){
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
                quantidade++;
        }
        return quantidade;
    }

    public static boolean palindromo(String s){
        int f = s.length()-1;
        for(int i=0; i<s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(f))
                return false;
            f--;
        }
        return true;
    }

    public static int numeroDigitos(String s) {
        int quantidade=0;
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<numeros.length; j++)
                if(s.charAt(i)==numeros[j])
                quantidade++;
        }
        return quantidade;
    }

    public static boolean comecaCom(String s){
        return s.startsWith("UNI");
    }

    public static boolean terminaCom(String s){
        return s.endsWith("RIO");
    }


}

