import java.util.*;

public class SistemaEscola {

    static class Pessoa {
        private String nome;
        private int idade;
        private String cpf;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void exibirInformacoes() {
            System.out.println("Nome: " + nome + ", Idade: " + idade);
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Pessoa) {
                Pessoa outra = (Pessoa) obj;
                return this.cpf != null && this.cpf.equals(outra.cpf);
            }
            return false;
        }
    }

    static class Aluno extends Pessoa {
        private String matricula;
        private List<Disciplina> disciplinas;

        public Aluno(String nome, int idade, String matricula) {
            super(nome, idade);
            this.matricula = matricula;
            this.disciplinas = new ArrayList<>();
        }

        @Override
        public void exibirInformacoes() {
            super.exibirInformacoes();
            System.out.println("Matrícula: " + matricula);
        }

        public void matricularEmDisciplina(Disciplina disciplina) {
            disciplinas.add(disciplina);
            System.out.println("Aluno matriculado em: " + disciplina.getNome());
        }

        public void listarDisciplinas() {
            System.out.println("Disciplinas do aluno:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(disciplina.getNome());
            }
        }

        public boolean estaMatriculadoNoCurso(Curso curso) {
            return disciplinas.containsAll(curso.getDisciplinas());
        }
    }

    // Classe Professor
    static class Professor extends Pessoa {
        private double salario;
        private String especialidade;
        private List<Disciplina> disciplinasLecionadas;

        public Professor(String nome, int idade, double salario, String especialidade) {
            super(nome, idade);
            this.salario = salario;
            this.especialidade = especialidade;
            this.disciplinasLecionadas = new ArrayList<>();
        }

        public void atribuirDisciplina(Disciplina disciplina) {
            disciplinasLecionadas.add(disciplina);
        }

        public void listarDisciplinasLecionadas() {
            System.out.println("Disciplinas lecionadas:");
            for (Disciplina disciplina : disciplinasLecionadas) {
                System.out.println(disciplina.getNome());
            }
        }

        public int calcularQuantidadeDeDisciplinas() {
            return disciplinasLecionadas.size();
        }
    }

    static class Disciplina {
        private String nome;
        private int cargaHoraria;
        private Professor professorResponsavel;

        public Disciplina(String nome, int cargaHoraria, Professor professorResponsavel) {
            this.nome = nome;
            this.cargaHoraria = cargaHoraria;
            this.professorResponsavel = professorResponsavel;
        }

        public String getNome() {
            return nome;
        }

        public int getCargaHoraria() {  // Método getter adicionado
            return cargaHoraria;
        }

        public Professor getProfessorResponsavel() {
            return professorResponsavel;
        }

        public void exibirInformacoes() {
            System.out.println("Disciplina: " + nome + ", Carga Horária: " + cargaHoraria + "h, Professor: " +
                    professorResponsavel.getNome());
        }
    }

    // Classe Curso
    static class Curso {
        private String nome;
        private List<Disciplina> disciplinas;

        public Curso(String nome) {
            this.nome = nome;
            this.disciplinas = new ArrayList<Disciplina>();
        }

        public void adicionarDisciplina(Disciplina disciplina) {
            disciplinas.add(disciplina);
        }

        public void listarDisciplinas() {
            System.out.println("Disciplinas do curso:");
            for (Disciplina disciplina : disciplinas) {
                System.out.println(disciplina.getNome());
            }
        }

        public int calcularCargaHorariaTotal() {
            return disciplinas.stream().mapToInt(Disciplina::getCargaHoraria).sum();
        }

        public List<Professor> listarProfessores() {
            Set<Professor> professores = new HashSet<>();
            for (Disciplina disciplina : disciplinas) {
                professores.add(disciplina.getProfessorResponsavel());
            }
            return new ArrayList<>(professores);
        }

        public List<Disciplina> getDisciplinas() {
            return disciplinas;
        }
    }

    static class Escola {
        public void adicionarPessoa(Pessoa pessoa) {
            pessoa.exibirInformacoes();
        }
    }
}
