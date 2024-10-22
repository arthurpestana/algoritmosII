package personagem;

public class Ladino extends Personagem {
    public Ladino(Personagem personagem) {
        super("Ladino", personagem.getHp(), personagem.getSp());
    }

    public void usarInvisibilidade() {
        System.out.println(this.getNome()+" usando Invisibilidade!");
    }
}
