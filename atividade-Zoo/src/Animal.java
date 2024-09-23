
public class Animal {
    private String nome;
    private Integer idade;
    private String especie;
    private Habitat habitat;

    public Animal(String nome, Integer idade, Habitat habitat, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Habitat getHabitat() {
        return habitat;
    }
    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }
}