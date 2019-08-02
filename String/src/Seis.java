import java.util.Random;
import java.util.Scanner;

public class Seis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String pai = sc.next();
        String mae = sc.next();
        String filho = new String();
        String filha = new String();

        recombinacao(pai, mae, filho, filha);
    }

    public static void recombinacao(String pai, String mae, String filha, String filho){
        Random corte = new Random();

        System.out.println(pai.length());
        int pontoDeCorte = corte.nextInt(pai.length());
        System.out.println("corte foi em: "+pontoDeCorte);


        char[] a = new char[pai.length()];
        char[] b = new char[pai.length()];

        for(int i=0; i<pontoDeCorte; i++){
            a[i] = mae.charAt(i);
            b[i] = pai.charAt(i);
        }

        for(int i=pontoDeCorte; i<pai.length(); i++){
            a[i] = pai.charAt(i);
            b[i] = mae.charAt(i);
        }
        filha = String.valueOf(a);
        filho = String.valueOf(b);

        filha = mutacao(filha);

        System.out.println(pai);
        System.out.println(mae);
        System.out.println(filha);
        System.out.println(filho);
    }

    public static String mutacao(String s){
        Random m = new Random();

        int posicao = m.nextInt(s.length());
        char mutante =  (char)(m.nextInt(26) + 'a');

        System.out.println("gerou a mutação "+mutante+" na posicao "+posicao);
        char mutacao[] = s.toCharArray();
        mutacao[posicao] = mutante;
        s = String.valueOf(mutacao);
        System.out.println("filha ficou com "+s);
        return s;
    }
}
