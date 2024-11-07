import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando professores
        Professor professor1 = new Professor("Carlos Almeida", 45, 7000.00, "Matemática");
        Professor professor2 = new Professor("Fernanda Silva", 38, 8000.00, "Física");

        // Criando disciplinas e atribuindo professores
        Disciplina matematicaAvancada = new Disciplina("Matemática Avançada", 60, professor1);
        Disciplina fisicaQuantica = new Disciplina("Física Quântica", 80, professor2);

        // Atribuindo as disciplinas aos professores
        professor1.atribuirDisciplina(matematicaAvancada);
        professor2.atribuirDisciplina(fisicaQuantica);

        // Criando um curso e adicionando disciplinas
        Curso cursoExemplo = new Curso("Curso de Engenharia");
        cursoExemplo.adicionarDisciplina(matematicaAvancada);
        cursoExemplo.adicionarDisciplina(fisicaQuantica);

        // Criando alunos
        Aluno aluno1 = new Aluno("João Pereira", 22, "202320");
        Aluno aluno2 = new Aluno("Maria Souza", 20, "202321");

        // Matriculando os alunos nas disciplinas
        aluno1.matricularEmDisciplina(matematicaAvancada);
        aluno1.matricularEmDisciplina(fisicaQuantica);
        aluno2.matricularEmDisciplina(fisicaQuantica);

        // Criando a escola e adicionando pessoas (alunos e professores)
        Escola escola = new Escola();
        escola.adicionarPessoa(professor1);
        escola.adicionarPessoa(professor2);
        escola.adicionarPessoa(aluno1);
        escola.adicionarPessoa(aluno2);

        // Exibindo informações
        System.out.println("\nInformações do Curso:");
        cursoExemplo.listarDisciplinas();
        System.out.println("Carga horária total do curso: " + cursoExemplo.calcularCargaHorariaTotal() + " horas");

        // Exibindo informações do aluno1
        System.out.println("\nInformações do Aluno:");
        aluno1.exibirInformacoes();

        // Exibindo informações do professor1
        System.out.println("\nInformações do Professor:");
        professor1.exibirInformacoes();

        // Verificando se o aluno1 está matriculado em todas as disciplinas do curso
        System.out.println("\nAluno João Pereira está matriculado em todas as disciplinas do curso? " + aluno1.estaMatriculadoNoCurso(cursoExemplo));

        // Listando professores do curso
        System.out.println("\nProfessores do Curso:");
        Set<Professor> professores = cursoExemplo.listarProfessores();
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }
}

