public class Main {
    public static void main(String[] args) {
        //Questão 1:
        Pessoa pessoa1 = new Pessoa("Arthur", 18);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        //Questão 2:
        System.out.println(pessoa1.cumprimentar());
    }
}