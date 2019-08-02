import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Empresa e1 = new Empresa("IF", "123456");
        Funcionario maria = new Funcionario("Maria", 1000, null);
        Funcionario jose = new Funcionario("Jose", 1500, null);
        Departamento d1 = new Departamento("RH");
        Departamento d2 = new Departamento("Finanças");
        d1.addFuncionario(maria);
        d2.addFuncionario(jose);
        e1.addDepartamento(d1);
        e1.addDepartamento(d2);
        e1.transferirFuncionario(maria, d1, d2);
        e1.getDepartamento("RH").darAumento(0.10);

    }
}
