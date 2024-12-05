public class Main {
    public static void main(String[] args) {
        SistemaEscola.Escola escola = new SistemaEscola.Escola();

        SistemaEscola.Aluno aluno = new SistemaEscola.Aluno("João", 20, "2023001");
        SistemaEscola.Professor professor = new SistemaEscola.Professor("Maria", 40, 5000.0, "Matemática");

        escola.adicionarPessoa(aluno);
        escola.adicionarPessoa(professor);

        SistemaEscola.Disciplina matematica = new SistemaEscola.Disciplina("Matemática", 40, professor);

        SistemaEscola.Curso curso = new SistemaEscola.Curso("Engenharia");
        curso.adicionarDisciplina(matematica);

        aluno.matricularEmDisciplina(matematica);
        professor.atribuirDisciplina(matematica);

        curso.listarDisciplinas();
        System.out.println("Carga horária total do curso: " + curso.calcularCargaHorariaTotal() + "h");

        System.out.println("Aluno está matriculado no curso? " + aluno.estaMatriculadoNoCurso(curso));

        System.out.println("Professores do curso:");
        for (SistemaEscola.Professor prof : curso.listarProfessores()) {
            System.out.println(prof.getNome());
        }

        System.out.println("Quantidade de disciplinas lecionadas pelo professor: " +
                professor.calcularQuantidadeDeDisciplinas());
    }
}