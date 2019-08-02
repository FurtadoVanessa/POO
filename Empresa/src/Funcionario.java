import java.util.Date;

public class Funcionario {

    private String nome;
    private double salario;
    private Date data;


    public Funcionario(String nome, double salario, Date data){
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }

    public Funcionario(){

    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
