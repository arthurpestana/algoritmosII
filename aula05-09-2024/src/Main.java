public class Main {
    public static void main(String[] args) {
        Annotation.Aluno aluno = new Annotation.Aluno(); //Instância da Classe Annotation.Aluno()
        aluno.setNome("Arthur");
        System.out.println("Nome do Aluno criado: " + aluno.getNome());
    }

    public class Annotation {
        //POO - Programação Orientata a Objetos -> Modelo de organização de códigos baseado em Classes e Objetos, facilitando a refatoração, organização dos dados, e reutilização do código
        //CLASSES -> Modelos conceitual que une os estruturas, dados e comportamentos relacionados
        //ATRIBUTOS -> São os dados associados as classes
        //MÉTODOS -> São as funcionalidades associadas as classes
        //OBJETO -> É uma instância da classe

        public static class Aluno { //Declaração da Classe
            //Atributos:
            String nome;
            int idade;
            String cpf;
            boolean alunoAtivo;

            //Métodos:

            public String getNome() {
                return nome;
            }

            public void setNome(String newNome) {
                this.nome = newNome;
            }
        }

        //CONCEITOS DA POO:
        //POLIMORFISMO
        //ENCAPSULAMENTO
        //HERANÇA
    }
}