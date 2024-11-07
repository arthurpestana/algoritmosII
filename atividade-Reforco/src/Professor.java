import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;
    private List<Disciplina> disciplinasLecionadas;

    public Professor(String nome, int idade, double salario, String especialidade) {
        super(nome, idade);
        this.salario = salario;
        this.especialidade = especialidade;
        this.disciplinasLecionadas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void atribuirDisciplina(Disciplina disciplina) {
        disciplinasLecionadas.add(disciplina);
    }

    public void listarDisciplinasLecionadas() {
        System.out.println("Disciplinas lecionadas por " + getNome() + ":");
        for (Disciplina disciplina : disciplinasLecionadas) {
            System.out.println("- " + disciplina.getNome());
        }
    }

    public int calcularQuantidadeDeDisciplinas() {
        return disciplinasLecionadas.size();
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Especialidade: " + especialidade);
        listarDisciplinasLecionadas();
    }
}
