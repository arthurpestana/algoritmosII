package personagem;

public class Guerreiro extends Personagem {
    public Guerreiro(Personagem personagem) {
        super("Guerreiro", personagem.getHp(), personagem.getSp());
    }

    public void equiparArmaduraPesada() {
        System.out.println(this.getNome()+" usando Armadura Pesada!");
    }
}
