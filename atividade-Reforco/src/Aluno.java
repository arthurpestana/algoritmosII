import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private String matricula;
    private List<Disciplina> disciplinas;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
        this.disciplinas = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void matricularEmDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas matriculadas:");
        for (Disciplina disciplina : disciplinas) {
            disciplina.exibirInformacoes();
        }
    }

    public boolean estaMatriculadoNoCurso(Curso curso) {
        for (Disciplina disciplina : curso.disciplinas) {
            boolean matriculado = false;
            for (Disciplina dAluno : disciplinas) {
                if (dAluno.getNome().equals(disciplina.getNome())) {
                    matriculado = true;
                    break;
                }
            }
            if (!matriculado) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + matricula);
        listarDisciplinas();
    }
}
