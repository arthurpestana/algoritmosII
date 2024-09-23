public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoológico de Campinas");

        Habitat habitatTerrestre = new Habitat("Terrestre", "Habitat Terrestre");
        Habitat habitatAquatico = new Habitat("Aquatico", "Habitat Aquatico");
        Habitat habitatAereo = new Habitat("Aereo", "Habitat Aereo");

        Mamifero onca = new Mamifero("Onça Pintada", 9, habitatTerrestre, "Onça");
        Mamifero leao = new Mamifero("Leão", 2, habitatTerrestre, "Leão");
        Reptil axolote = new Reptil("Axolote",1, habitatAquatico, "Axolote");
        Reptil iguana = new Reptil("Iguana",6, habitatTerrestre, "Iguana");
        Ave arara = new Ave("Arara Azul", 1, habitatAereo, "Arara");
        Ave tucano = new Ave("Tucano", 4, habitatAereo, "Tucano");

        zoo.setHabitats(habitatTerrestre);
        zoo.setHabitats(habitatAquatico);
        zoo.setHabitats(habitatAereo);

        zoo.setAnimais(onca);
        zoo.setAnimais(leao);
        zoo.setAnimais(axolote);
        zoo.setAnimais(iguana);
        zoo.setAnimais(arara);
        zoo.setAnimais(tucano);


        System.out.println("Lista de Todos os Animais: ");
        for (Animal animal : zoo.getAnimais()) {
            System.out.println(animal.getNome());
        }

        System.out.println("\nLista de Todos os Animais no Habitat Terrestre: ");
        for (Animal animal : zoo.getAnimalToHabitat(habitatTerrestre)) {
            System.out.println(animal.getNome());
        }
    }
}