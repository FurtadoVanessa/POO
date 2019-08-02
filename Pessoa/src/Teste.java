public class Teste {

    public static void main(String[] args){

        Pessoa[] clientes = new Pessoa[2];

        Pessoa c1 = new Fisica("1234", "5678", "Joao", "Rua A", "555-6204");
        Pessoa c2 = new Juridica("9876", "54321", "Maria", "Rua B", "444-5193");
        clientes[0] = c1;
        clientes[1] = c2;

    }
}
