//Questão 1:
public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }

    //Questão 2:
    public String cumprimentar() {
        return ("Bem-Vindo, "+getNome());
    }
}