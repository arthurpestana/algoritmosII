public class Reptil extends Animal {
    public Reptil(String nome, Integer idade, Habitat habitat, String especie) {
        super(nome, idade, habitat, especie);
    }

    public void TrocarPele() {
        System.out.println("Trocar pele");
    }
}
