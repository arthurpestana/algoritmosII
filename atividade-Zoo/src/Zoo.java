import java.util.ArrayList;

public class Zoo {
    private String nome;
    private ArrayList<Animal> animais;
    private ArrayList<Habitat> habitats;

    public Zoo(String nome) {
        this.nome = nome;
        animais = new ArrayList<>();
        habitats = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }
    public void setAnimais(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Habitat> getHabitats() {
        return habitats;
    }
    public void setHabitats(Habitat habitat) {
        habitats.add(habitat);
    }

    public ArrayList<Animal> getAnimalToHabitat(Habitat habitat) {
        ArrayList<Animal> animalHabitat = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getHabitat().equals(habitat)) {
                animalHabitat.add(animal);
            }
        }
        return animalHabitat;
    }
}
