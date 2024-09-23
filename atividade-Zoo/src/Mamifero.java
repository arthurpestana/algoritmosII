
public class Mamifero extends Animal {
    public Mamifero(String nome, Integer idade, Habitat habitat, String especie) {
        super(nome, idade, habitat, especie);
    }

    public void Amamentar() {
        System.out.println("Amamentar");
    }
}
