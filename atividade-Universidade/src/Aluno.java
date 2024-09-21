import java.util.ArrayList;
import java.util.Map;

public class Aluno {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Integer> horasCursadas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
        this.horasCursadas = new ArrayList<Integer>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplina, Integer horasCursadas) {
        if (!this.disciplinas.contains(disciplina)) {
            this.disciplinas.add(disciplina);
            if (horasCursadas != null && horasCursadas >= 0 && horasCursadas <= disciplina.getCargaHoraria()) {
                this.horasCursadas.add(horasCursadas);
            } else {
                this.horasCursadas.add(0);
                System.out.println("Tempo cursado inválido");
            }
            System.out.println("Matriculado em " + disciplina.getNome());
        }
        else {
            System.out.println("O Aluno já está matriculado na disciplina " + disciplina);
        }
    }

    public void setHorasCursadas(Integer horasCursadas, Disciplina disciplina) {
        if (this.disciplinas.contains(disciplina)) {
            int index = this.disciplinas.indexOf(disciplina);
            if (horasCursadas != null && horasCursadas >= 0 && horasCursadas <= this.disciplinas.get(index).getCargaHoraria()) {
                this.horasCursadas.set(index, horasCursadas);
                System.out.println("Tempo cursado atualizado em " + disciplina.getNome());
            }
            else if (horasCursadas>disciplina.getCargaHoraria()) {
                this.horasCursadas.set(index, disciplina.getCargaHoraria());
                System.out.println("Tempo cursado excedente em" + disciplina.getNome() + ". Ajustado para o máximo da carga horária");
            }
            else {
                System.out.println("Tempo cursado inválido");
            }
        }
        else {
            System.out.println("Disciplina Inválida");
        }
    }
    public ArrayList<Integer> getHorasCursadas() {
        return horasCursadas;
    }
}
