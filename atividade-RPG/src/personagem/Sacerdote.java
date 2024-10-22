package personagem;

public class Sacerdote extends Personagem {
    public Sacerdote(Personagem personagem) {
        super("Sacerdote", personagem.getHp(), personagem.getSp());
    }

    public void castMilagre() {
        System.out.println(this.getNome()+" usando Milagre!");
    }
}
