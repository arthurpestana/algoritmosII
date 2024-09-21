import java.util.ArrayList;

public class Universidade {
    private ArrayList<Disciplina> disciplina;
    private ArrayList<Aluno> aluno;
    private ArrayList<Professor> professor;

    public Universidade() {
        disciplina = new ArrayList<Disciplina>();
        aluno = new ArrayList<Aluno>();
        professor = new ArrayList<Professor>();
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplina.add(disciplina);
        System.out.println("Disciplina adicionada: " + disciplina.getNome());
    }
    public void addAluno(Aluno aluno) {
        this.aluno.add(aluno);
        System.out.println("Aluno adicionado: " + aluno.getNome());
    }
    public void addProfessor(Professor professor) {
        this.professor.add(professor);
        System.out.println("Professor adicionado: " + professor.getNome());
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }
    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }
    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public void getDisciplinasHorasToAlunos(Aluno aluno) {
        System.out.println("\nAluno: "+ aluno.getNome());
        for (int i = 0; i<aluno.getDisciplinas().size(); i++) {
            System.out.println(aluno.getDisciplinas().get(i).getNome() + "\t-\t" + aluno.getHorasCursadas().get(i));
        }
    }
    public Integer getTotalHorasCursadas(Aluno aluno) {
        int quant = aluno.getHorasCursadas().size();
        int total = 0;
        for (int i = 0; i<quant; i++) {
            total += aluno.getHorasCursadas().get(i);
        }
        return total;
    }
    public ArrayList<Disciplina> getDisciplinasIncompletas(Aluno aluno) {
        ArrayList<Disciplina> disc_incompleta = new ArrayList<>();
        int quant = aluno.getDisciplinas().size();
        for (int i = 0; i<quant; i++) {
            Integer cargaHoraria = aluno.getDisciplinas().get(i).getCargaHoraria();
            Integer horasCursadas = aluno.getHorasCursadas().get(i);
            if (horasCursadas < cargaHoraria || horasCursadas != cargaHoraria) {
                disc_incompleta.add(aluno.getDisciplinas().get(i));
            }
        }
        return disc_incompleta;
    }
}
