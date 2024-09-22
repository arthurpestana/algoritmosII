//Questão 11:

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        if (!this.funcionarios.contains(funcionario)) {
            this.funcionarios.add(funcionario);
        }
    }
    public void removerFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public Double totalPagamentoFuncionarios() {
        Double total = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.getSalario();
        }
        return total;
    }
}
