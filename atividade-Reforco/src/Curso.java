import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nome;
    List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do curso " + nome + ":");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
    }

    public Set<Professor> listarProfessores() {
        Set<Professor> professores = new HashSet<>();
        for (Disciplina disciplina : disciplinas) {
            professores.add(disciplina.getProfessorResponsavel());
        }
        return professores;
    }

    public int calcularCargaHorariaTotal() {
        int cargaHorariaTotal = 0;
        for (Disciplina disciplina : disciplinas) {
            cargaHorariaTotal += disciplina.getCargaHoraria();
        }
        return cargaHorariaTotal;
    }
}

