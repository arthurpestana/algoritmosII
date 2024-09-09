public class annotation {
    public static void main(String[] args) {
        //POO - Programação Orientata a Objetos -> Modelo de organização de códigos baseado em Classes e Objetos, facilitando a refatoração, organização dos dados, e reutilização do código
        //CLASSES -> Modelos conceitual que une os estruturas, dados e comportamentos relacionados
        //ATRIBUTOS -> São os dados associados as classes
        //MÉTODOS -> São as funcionalidades associadas as classes
        //OBJETO -> É uma instância da classe

        public class Aluno { //Declaração da Classe
            //Atributos:
            String nome;
            int idade;
            String cpf;
            boolean alunoAtivo;

            //Métodos:

            public String getNome() {
                return nome;
            }

            public String getCpf() {
                return cpf;
            }
        }

        Aluno aluno1 = new Aluno(); //Instanciar a Classe -- OBJETO


        //CONCEITOS DA POO:
        //POLIMORFISMO
        //ENCAPSULAMENTO
        //HERANÇA
    }
}