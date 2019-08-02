import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String CNPJ;
    private Departamento[] departamentos = new Departamento[10];
    private int ponteiro =0;

    public Empresa(String nome, String CNPJ){
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public void addDepartamento(Departamento departamento){

        this.departamentos[ponteiro] = departamento;
        this.ponteiro++;
    }

    public Departamento getDepartamento(String nome){
        for(Departamento d : departamentos){
            if(d.getNome().compareToIgnoreCase(nome)==0){
                return d;
            }
        }
        return null;
    }

    public void transferirFuncionario(Funcionario f1, Departamento d1, Departamento d2){
        d1.removeFuncionario(f1);
        d2.addFuncionario(f1);
    }
}
