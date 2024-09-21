import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();
        Professor professor1 = new Professor("Alysson", "Programação");
        Professor professor2 = new Professor("Mailson", "Infraestrutura");
        Professor professor3 = new Professor("Carlos Henrique", "Análise de Dados");

        Disciplina disciplina1 = new Disciplina("Algoritmos de Programação II", 380, professor1);
        Disciplina disciplina2 = new Disciplina("Arquitetura de Computadores II", 420, professor2);
        Disciplina disciplina3 = new Disciplina("Banco de Dados I", 360, professor3);

        Aluno aluno1 = new Aluno("Arthur");
        aluno1.setDisciplinas(disciplina1, 0);
        aluno1.setDisciplinas(disciplina2, 0);
        aluno1.setDisciplinas(disciplina3, 0);

        aluno1.setHorasCursadas(120, disciplina1);
        aluno1.setHorasCursadas(430, disciplina2);
        aluno1.setHorasCursadas(60, disciplina3);

        universidade.addDisciplina(disciplina1);
        universidade.addDisciplina(disciplina2);
        universidade.addDisciplina(disciplina3);
        universidade.addAluno(aluno1);
        universidade.addProfessor(professor1);
        universidade.addProfessor(professor2);
        universidade.addProfessor(professor3);

        universidade.getDisciplinasHorasToAlunos(aluno1);
        System.out.println("\nTotal de Horas cursadas do aluno "+aluno1.getNome()+": "+universidade.getTotalHorasCursadas(aluno1));
        ArrayList<Disciplina> disc_incompletas = universidade.getDisciplinasIncompletas(aluno1);
        System.out.println("\nDisciplinas Incompletas do aluno "+aluno1.getNome());
        for (int i=0; i<disc_incompletas.size(); i++){
            System.out.println(disc_incompletas.get(i).getNome());
        }
    }
}