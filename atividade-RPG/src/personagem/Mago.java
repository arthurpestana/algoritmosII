package personagem;

public class Mago extends Personagem {
    public Mago(Personagem personagem) {
        super("Mago", personagem.getHp(), personagem.getSp());
    }

    public void castMagiaArcana() {
        System.out.println(this.getNome()+" usando Magia Arcana"!);
    }
}
