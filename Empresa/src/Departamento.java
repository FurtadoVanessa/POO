import java.util.ArrayList;

public class Departamento {

    private String nome;
    private Funcionario[] funcionarios = new Funcionario[100];
    private int ponteiro = 0;

    public Departamento(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void addFuncionario(Funcionario f){
        this.funcionarios[ponteiro] = f;
        this.ponteiro++;
    }

    public void removeFuncionario(Funcionario f){
        for(int i=0; i<funcionarios.length; i++){
            if(funcionarios[i].getNome().compareToIgnoreCase(f.getNome())==0){
                funcionarios[i] = null;
                i = funcionarios.length;
            }
        }
    }

    public void darAumento(double porcentagem){
        for(Funcionario f : funcionarios){
            f.setSalario(f.getSalario()*(1+porcentagem));
        }
    }
}
